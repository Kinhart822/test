package com.spring.dao;

import com.spring.model.Member;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MemberDAOImpl implements MemberDAO {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public Member create(Member member) {
        try (Session session = sessionFactory.openSession()) {
            session.getTransaction().begin();
            session.save(member);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
        return member;
    }

    @Override
    public Member update(Member member) {
        try (Session session = sessionFactory.openSession()) {
            session.getTransaction().begin();

            Member memberDB = session.find(Member.class, member.getId());
            if (memberDB != null) {
                session.merge(member);
            }

            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
        return member;
    }

    @Override
    public Member updateProfile(Member member) {
        try (Session session = sessionFactory.openSession()) {
            session.getTransaction().begin();

            // Find member by email
            Member memberDB = session.createQuery("from Member where email = :email", Member.class)
                    .setParameter("email", member.getEmail())
                    .uniqueResult();

            if (memberDB != null) {
                // Update the member's details
                memberDB.setFirstName(member.getFirstName());
                memberDB.setLastName(member.getLastName());
                memberDB.setPhone(member.getPhone());
                memberDB.setDescription(member.getDescription());
                session.merge(memberDB);
            }

            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
        return member;
    }


    @Override
    public Member delete(Member member) {
        try (Session session = sessionFactory.openSession()) {
            session.getTransaction().begin();
            session.remove(member);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
        return member;
    }

    @Override
    public Member readOne(Integer id) {
        Member member = null;
        try (Session session = sessionFactory.openSession()) {
            session.getTransaction().begin();
            member = session.find(Member.class, id);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
        return member;
    }

    @Override
    public List<Member> readAll() {
        List<Member> members = null;
        try (Session session = sessionFactory.openSession()) {
            session.getTransaction().begin();
            members = session.createQuery("from Member", Member.class).list();
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
        return members;
    }

    @Override
    public Member findByEmailAndPassword(String email, String password) {
        Member member = null;
        try (Session session = sessionFactory.openSession()) {
            session.getTransaction().begin();
            member = session.createQuery("from Member where email = :email and password = :password", Member.class)
                    .setParameter("email", email)
                    .setParameter("password", password)
                    .uniqueResult();
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
        return member;
    }

    @Override
    public Member findByEmail(String email) {
        Member member = null;
        try (Session session = sessionFactory.openSession()) {
            session.getTransaction().begin();
            member = session.createQuery("from Member where email = :email", Member.class)
                    .setParameter("email", email)
                    .uniqueResult();
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
        return member;
    }

    @Override
    public List<Member> readAll(int page, int pageSize) {
        List<Member> members = null;
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            Query<Member> query = session.createQuery("from Member", Member.class);
            query.setFirstResult((page - 1) * pageSize);
            query.setMaxResults(pageSize);
            members = query.list();
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
        return members;
    }

    @Override
    public List<Member> findByUserName(String name) {
        List<Member> members = null;
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            Query<Member> query = session.createQuery("from Member where userName like :name", Member.class);
            query.setParameter("name", "%" + name + "%");
            members = query.list();
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
        return members;
    }
}
