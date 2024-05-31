class TuringMachine:
    # Initialize the Turing machine
    def __init__(self, tape, start_position, transitions):
        self.__tape = list(tape)
        self.__head = start_position
        self.__transitions = transitions
        self.__state = 'startExp'
        self.__halted = False
        self.__steps = []  # List to store steps

    # Step method
    def step(self):
        if self.__halted:
            return
        current_symbol = self.__tape[self.__head]
        if (self.__state, current_symbol) in self.__transitions:
            new_symbol, new_state, move = self.__transitions[(self.__state, current_symbol)]
            self.__tape[self.__head] = new_symbol
            self.__state = new_state
            if move == 'L':
                if self.__head == 0:         # If at the beginning of tape, insert '_' at the beginning
                    self.__tape.insert(0, '_')
                else:
                    self.__head -= 1         # Move the head to the left
            elif move == 'R':
                self.__head += 1            # Move the head to the right
                if self.__head == len(self.__tape)-1:     # If at the end of tape, insert '_' at the end
                    self.__tape.append('_')
            if self.__state == 'h':
                self.__halted = True
            self.__steps.append((self.__state, self.__tape[:], self.__head, move))
        else:
            self.__halted = True

    # Run method
    def run(self):
        while not self.__halted:
            self.step()
        return ''.join(self.__tape).strip('_')

    # Print out the execution steps of the Turing machine
    def print_steps(self):
        for i, step in enumerate(self.__steps):
            state, tape, head, move = step
            print(f"\nStep {i + 1}: State = {state}, Tape = {''.join(tape)}, Head = {head}, Move = {move}")

    #       Input of my Turing machine


# The list of instruction sets (5-tuples command)
instruction_sets = {
    ('startExp', '0'): ('0', 'initv1', 'L'),
    ('startExp', '1'): ('1', 'initv1', 'L'),

    ('initv1', '_'): ('|', 'initv2', 'L'),
    ('initv2', '_'): ('B', 'initv3', 'L'),
    ('initv3', '_'): ('1', 'initv4', 'L'),
    ('initv4', '_'): ('*', 'rightv1', 'R'),

    ('rightv1', '0'): ('0', 'rightv1', 'R'),
    ('rightv1', '1'): ('1', 'rightv1', 'R'),
    ('rightv1', '*'): ('*', 'rightv1', 'R'),
    ('rightv1', '|'): ('|', 'rightv1', 'R'),
    ('rightv1', 'B'): ('B', 'rightv1', 'R'),
    ('rightv1', '^'): ('^', 'rightv1', 'R'),
    ('rightv1', '_'): ('_', 'readC', 'L'),

    ('readC', '0'): ('0', 'checkFull0', 'L'),
    ('readC', '1'): ('1', 'decrement', 'R'),

    ('checkFull0', '0'): ('0', 'checkFull0', 'L'),
    ('checkFull0', '^'): ('^', 'rightv5', 'R'),
    ('checkFull0', '1'): ('1', 'rightv4', 'R'),

    ('rightv4', '0'): ('0', 'rightv4', 'R'),
    ('rightv4', '1'): ('1', 'rightv4', 'R'),
    ('rightv4', '_'): ('_', 'decrement', 'L'),

    ('rightv5', '0'): ('0', 'rightv5', 'R'),
    ('rightv5', '_'): ('_', 'tidyv1', 'L'),

    ('tidyv1', '0'): ('_', 'tidyv1', 'L'),
    ('tidyv1', '1'): ('_', 'tidyv1', 'L'),
    ('tidyv1', '^'): ('_', 'tidyv1', 'L'),
    ('tidyv1', '|'): ('_', 'tidyv1', 'L'),
    ('tidyv1', 'B'): ('_', 'tidyv2', 'L'),

    ('tidyv2', '0'): ('0', 'tidyv2', 'L'),
    ('tidyv2', '1'): ('1', 'tidyv2', 'L'),
    ('tidyv2', '*'): ('_', 'doneExp', 'R'),

    ('doneExp', '_'): ('_', 'h', 'R'),

    ('decrement', '_'): ('_', 'decrement', 'L'),
    ('decrement', '1'): ('0', 'leftv1', 'L'),
    ('decrement', '0'): ('1', 'decrement', 'L'),
    ('decrement', '^'): ('^', 'leftv1', 'L'),

    ('leftv1', '0'): ('0', 'leftv1', 'L'),
    ('leftv1', '1'): ('1', 'leftv1', 'L'),
    ('leftv1', '^'): ('^', 'duplicateX', 'L'),

    ('duplicateX', '1'): ('@', 'dup1', 'L'),
    ('duplicateX', '0'): ('@', 'dup0', 'L'),

    ('dup1', '0'): ('0', 'dup1', 'L'),
    ('dup1', '1'): ('1', 'dup1', 'L'),
    ('dup1', '|'): ('|', 'dup1', 'L'),
    ('dup1', '*'): ('*', 'dup1', 'L'),
    ('dup1', 'B'): ('B', 'dup1', 'L'),
    ('dup1', '_'): ('1', 'backDup1', 'R'),

    ('dup0', '0'): ('0', 'dup0', 'L'),
    ('dup0', '1'): ('1', 'dup0', 'L'),
    ('dup0', '|'): ('|', 'dup0', 'L'),
    ('dup0', '*'): ('*', 'dup0', 'L'),
    ('dup0', 'B'): ('B', 'dup0', 'L'),
    ('dup0', '_'): ('0', 'backDup0', 'R'),

    ('backDup1', '@'): ('1', 'duplicateX', 'L'),
    ('backDup1', '0'): ('0', 'backDup1', 'R'),
    ('backDup1', '1'): ('1', 'backDup1', 'R'),
    ('backDup1', '*'): ('*', 'backDup1', 'R'),
    ('backDup1', 'B'): ('B', 'backDup1', 'R'),
    ('backDup1', '|'): ('|', 'checkDoneDupX1', 'R'),

    ('backDup0', '@'): ('0', 'duplicateX', 'L'),
    ('backDup0', '0'): ('0', 'backDup0', 'R'),
    ('backDup0', '1'): ('1', 'backDup0', 'R'),
    ('backDup0', '*'): ('*', 'backDup0', 'R'),
    ('backDup0', 'B'): ('B', 'backDup0', 'R'),
    ('backDup0', '|'): ('|', 'checkDoneDupX0', 'R'),

    ('checkDoneDupX1', '@'): ('1', 'leftv2', 'L'),
    ('checkDoneDupX1', '0'): ('0', 'backDup1', 'R'),
    ('checkDoneDupX1', '1'): ('1', 'backDup1', 'R'),
    ('checkDoneDupX0', '@'): ('0', 'leftv2', 'L'),
    ('checkDoneDupX0', '0'): ('0', 'backDup0', 'R'),
    ('checkDoneDupX0', '1'): ('1', 'backDup0', 'R'),

    ('leftv2', '0'): ('0', 'leftv2', 'L'),
    ('leftv2', '1'): ('1', 'leftv2', 'L'),
    ('leftv2', '*'): ('*', 'leftv2', 'L'),
    ('leftv2', '|'): ('|', 'leftv2', 'L'),
    ('leftv2', 'B'): ('B', 'leftv2', 'L'),
    ('leftv2', '_'): ('_', 'startMult', 'R'),

    ('doneMult', '0'): ('0', 'leftv3', 'L'),
    ('doneMult', '1'): ('1', 'leftv3', 'L'),

    ('leftv3', '0'): ('0', 'leftv3', 'L'),
    ('leftv3', '1'): ('1', 'leftv3', 'L'),
    ('leftv3', '_'): ('s', 'rightv2', 'R'),

    ('rightv2', '0'): ('0', 'rightv2', 'R'),
    ('rightv2', '1'): ('1', 'rightv2', 'R'),
    ('rightv2', '_'): ('_', 'shiftAns', 'L'),
    ('rightv2', 'B'): ('B', 'rightv1', 'R'),

    ('shiftAns', '0'): ('b', 'shiftAns0', 'R'),
    ('shiftAns', '1'): ('b', 'shiftAns1', 'R'),
    ('shiftAns', 's'): ('_', 'rightv3', 'R'),

    ('rightv3', '_'): ('_', 'rightv3', 'R'),
    ('rightv3', '0'): ('0', 'initv4', 'L'),
    ('rightv3', '1'): ('1', 'initv4', 'L'),

    ('shiftAns0', '_'): ('_', 'shiftAns0', 'R'),
    ('shiftAns0', '0'): ('0', 'back1ShiftAns0', 'L'),
    ('shiftAns0', '1'): ('1', 'back1ShiftAns0', 'L'),
    ('shiftAns0', 'B'): ('B', 'back1ShiftAns0', 'L'),

    ('shiftAns1', '_'): ('_', 'shiftAns1', 'R'),
    ('shiftAns1', '0'): ('0', 'back1ShiftAns1', 'L'),
    ('shiftAns1', '1'): ('1', 'back1ShiftAns1', 'L'),
    ('shiftAns1', 'B'): ('B', 'back1ShiftAns1', 'L'),

    ('back1ShiftAns0', '_'): ('0', 'backShiftAns', 'L'),
    ('back1ShiftAns1', '_'): ('1', 'backShiftAns', 'L'),

    ('backShiftAns', '_'): ('_', 'backShiftAns', 'L'),
    ('backShiftAns', 'b'): ('_', 'shiftAns', 'L'),
    ('backShiftAns', '0'): ('0', 'rightv2', 'R'),
    ('backShiftAns', '1'): ('1', 'rightv2', 'R'),

    ('startMult', '0'): ('0', 'initv0', 'L'),
    ('startMult', '1'): ('1', 'initv0', 'L'),
    ('initv0', '_'): ('+', 'rightv0', 'R'),

    ('rightv0', '0'): ('0', 'rightv0', 'R'),
    ('rightv0', '1'): ('1', 'rightv0', 'R'),
    ('rightv0', '*'): ('*', 'rightv0', 'R'),
    ('rightv0', 'B'): ('B', 'readB', 'L'),

    ('readB', '0'): ('_', 'doubleL', 'L'),
    ('readB', '1'): ('_', 'addA', 'L'),

    ('addA', '0'): ('0', 'addA', 'L'),
    ('addA', '1'): ('1', 'addA', 'L'),
    ('addA', '*'): ('*', 'read', 'L'),

    ('doubleL', '0'): ('0', 'doubleL', 'L'),
    ('doubleL', '1'): ('1', 'doubleL', 'L'),
    ('doubleL', '*'): ('0', 'shift', 'R'),

    ('double', '0'): ('0', 'double', 'R'),
    ('double', '1'): ('1', 'double', 'R'),
    ('double', '+'): ('+', 'double', 'R'),
    ('double', '*'): ('0', 'shift', 'R'),

    ('shift', '0'): ('*', 'shift0', 'R'),
    ('shift', '1'): ('*', 'shift1', 'R'),
    ('shift', '_'): ('_', 'tidyv0', 'L'),

    ('shift0', '0'): ('0', 'shift0', 'R'),
    ('shift0', '1'): ('0', 'shift1', 'R'),
    ('shift0', '_'): ('0', 'rightv0', 'R'),

    ('shift1', '0'): ('1', 'shift0', 'R'),
    ('shift1', '1'): ('1', 'shift1', 'R'),
    ('shift1', '_'): ('1', 'rightv0', 'R'),

    ('tidyv0', '0'): ('_', 'tidyv0', 'L'),
    ('tidyv0', '1'): ('_', 'tidyv0', 'L'),
    ('tidyv0', '+'): ('_', 'doneMult', 'L'),

    ('read', '0'): ('c', 'have0', 'L'),
    ('read', '1'): ('c', 'have1', 'L'),
    ('read', '+'): ('+', 'rewrite', 'L'),

    ('have0', '0'): ('0', 'have0', 'L'),
    ('have0', '1'): ('1', 'have0', 'L'),
    ('have0', '+'): ('+', 'add0', 'L'),

    ('have1', '0'): ('0', 'have1', 'L'),
    ('have1', '1'): ('1', 'have1', 'L'),
    ('have1', '+'): ('+', 'add1', 'L'),

    ('add0', '0'): ('$', 'back0', 'R'),
    ('add0', '_'): ('$', 'back0', 'R'),
    ('add0', '1'): ('&', 'back0', 'R'),
    ('add0', '$'): ('$', 'add0', 'L'),
    ('add0', '&'): ('&', 'add0', 'L'),

    ('add1', '0'): ('&', 'back1', 'R'),
    ('add1', '_'): ('&', 'back1', 'R'),
    ('add1', '1'): ('$', 'carry', 'L'),
    ('add1', '$'): ('$', 'add1', 'L'),
    ('add1', '&'): ('&', 'add1', 'L'),

    ('carry', '0'): ('1', 'back1', 'R'),
    ('carry', '_'): ('1', 'back1', 'R'),
    ('carry', '1'): ('0', 'carry', 'L'),

    ('back0', '0'): ('0', 'back0', 'R'),
    ('back0', '1'): ('1', 'back0', 'R'),
    ('back0', '$'): ('$', 'back0', 'R'),
    ('back0', '&'): ('&', 'back0', 'R'),
    ('back0', '+'): ('+', 'back0', 'R'),
    ('back0', 'c'): ('0', 'read', 'L'),

    ('back1', '0'): ('0', 'back1', 'R'),
    ('back1', '1'): ('1', 'back1', 'R'),
    ('back1', '$'): ('$', 'back1', 'R'),
    ('back1', '&'): ('&', 'back1', 'R'),
    ('back1', '+'): ('+', 'back1', 'R'),
    ('back1', 'c'): ('1', 'read', 'L'),

    ('rewrite', '$'): ('0', 'rewrite', 'L'),
    ('rewrite', '&'): ('1', 'rewrite', 'L'),
    ('rewrite', '0'): ('0', 'rewrite', 'L'),
    ('rewrite', '1'): ('1', 'rewrite', 'L'),
    ('rewrite', '_'): ('_', 'double', 'R')
}

#       The tape of my Turing machine
initial_tape = "11^10"
start_position = 0

# Create a Turing machine instance
tm = TuringMachine(initial_tape, start_position, instruction_sets)

# Perform the computation and write the result to the tape
result = tm.run()  # Run the Turing Machine

# Running steps and the result
tm.print_steps()
print("Final Tape:", result)