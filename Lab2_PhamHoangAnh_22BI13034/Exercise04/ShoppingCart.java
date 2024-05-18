package Lab2_PhamHoangAnh_22BI13034.Exercise04;

public class ShoppingCart {
    private String[] cartContents;
    private int itemCount = 0;

    public ShoppingCart(int n) {
        cartContents = new String[n];
    }

    public int getItemCount() {
        return itemCount;
    }
    private void setItemCount(int count) {
        itemCount = count;
    }
    public void addToCart(String item) {
        if (itemCount < cartContents.length) {
            cartContents[itemCount] = item;
            setItemCount(itemCount + 1);
        } else {
            System.out.println("Cart is full. Cannot add " + item);
        }
    }
    public void removeFromCart(String item) {
        for (int i = 0; i < itemCount; i++) {
            if (cartContents[i].equals(item)) {
                for (int j = i; j < itemCount - 1; j++) {
                    cartContents[j] = cartContents[j + 1];
                }
                setItemCount(itemCount - 1);
                break;
            }
        }
    }
    public void checkOut() {
        System.out.println("==> Checking out " + itemCount + " items.");
        for (int i = 0; i < itemCount; i++) {
            System.out.println(cartContents[i]);
        }
    }
}
