import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Define a class representing state transitions
class StateTransition {
    private final String state;
    private final char symbol;

    public StateTransition(String state, char symbol) {
        this.state = state;
        this.symbol = symbol;
    }

    // Override equals and hashCode methods for using StateTransition as keys in HashMap
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StateTransition that = (StateTransition) o;
        return symbol == that.symbol && state.equals(that.state);
    }

    @Override
    public int hashCode() {
        return 31 * state.hashCode() + symbol;
    }
}

// Define a class representing actions
class Action {
    private final char newSymbol;
    private final String newState;
    private final String move;

    public Action(char newSymbol, String newState, String move) {
        this.newSymbol = newSymbol;
        this.newState = newState;
        this.move = move;
    }

    public char getNewSymbol() {
        return newSymbol;
    }

    public String getNewState() {
        return newState;
    }

    public String getMove() {
        return move;
    }
}

// Define the Turing Machine class
public class TuringMachine {
    private List<Character> tape;
    private int head;
    private Map<StateTransition, Action> transitions;
    private String state;
    private boolean halted;
    private List<Object[]> steps; // List to store steps

    // Constructor
    public TuringMachine(String tape, int start_position, Map<StateTransition, Action> transitions) {
        this.tape = new ArrayList<>();
        for (char c : tape.toCharArray()) {
            this.tape.add(c);
        }
        this.head = start_position;
        this.transitions = transitions;
        this.state = "startExp";
        this.halted = false;
        this.steps = new ArrayList<>();
    }

    // Step method
    public void step() {
        if (halted) return;
        char currentSymbol = tape.get(head);
        StateTransition transition = new StateTransition(state, currentSymbol);
        if (transitions.containsKey(transition)) {
            Action action = transitions.get(transition);
            tape.set(head, action.getNewSymbol());
            state = action.getNewState();
            if (action.getMove().equals("L")) {
                if (head == 0) {
                    tape.add(0, '_');
                } else {
                    head--;
                }
            } else if (action.getMove().equals("R")) {
                head++;
                if (head == tape.size() - 1) {
                    tape.add('_');
                }
            }
            if (state.equals("h")) {
                halted = true;
            }
            steps.add(new Object[]{state, new ArrayList<>(tape), head, action.getMove()});
        } else {
            halted = true;
        }
    }

    // Run method
    public String run() {
        while (!halted) {
            step();
        }
        List<String> stringList = tape.stream().map(String::valueOf).collect(Collectors.toList());
        return String.join("", stringList).replaceAll("^_+|_+$", "");
    }


    // Print out the execution steps of the Turing machine
    public void printSteps() {
        for (int i = 0; i < steps.size(); i++) {
            Object[] step = steps.get(i);
            String state = (String) step[0];
            List<Character> tape = (List<Character>) step[1];
            int head = (int) step[2];
            String move = (String) step[3];
            System.out.printf("\nStep %d: State = %s, Tape = %s, Head = %d, Move = %s%n", i + 1, state, tape.toString(), head, move);
        }
    }

    public static void main(String[] args) {
        // Define the instruction set
        Map<StateTransition, Action> instructionSet = new HashMap<>();
        // Add transitions and actions to the instruction set...
        instructionSet.put(new StateTransition("startExp", '0'), new Action('0', "initv1", "L"));
        instructionSet.put(new StateTransition("startExp", '1'), new Action('1', "initv1", "L"));

        instructionSet.put(new StateTransition("initv1", '_'), new Action('|', "initv2", "L"));
        instructionSet.put(new StateTransition("initv2", '_'), new Action('B', "initv3", "L"));
        instructionSet.put(new StateTransition("initv3", '_'), new Action('1', "initv4", "L"));
        instructionSet.put(new StateTransition("initv4", '_'), new Action('*', "rightv1", "R"));


        instructionSet.put(new StateTransition("rightv1", '0'), new Action('0', "rightv1", "R"));
        instructionSet.put(new StateTransition("rightv1", '1'), new Action('1', "rightv1", "R"));
        instructionSet.put(new StateTransition("rightv1", '*'), new Action('*', "rightv1", "R"));
        instructionSet.put(new StateTransition("rightv1", '|'), new Action('|', "rightv1", "R"));
        instructionSet.put(new StateTransition("rightv1", 'B'), new Action('B', "rightv1", "R"));
        instructionSet.put(new StateTransition("rightv1", '^'), new Action('^', "rightv1", "R"));
        instructionSet.put(new StateTransition("rightv1", '_'), new Action('_', "readC", "L"));

        instructionSet.put(new StateTransition("readC", '0'), new Action('0', "checkFull0", "L"));
        instructionSet.put(new StateTransition("readC", '1'), new Action('1', "decrement", "R"));

        instructionSet.put(new StateTransition("checkFull0", '0'), new Action('0', "checkFull0", "L"));
        instructionSet.put(new StateTransition("checkFull0", '^'), new Action('^', "rightv5", "R"));
        instructionSet.put(new StateTransition("checkFull0", '1'), new Action('1', "rightv4", "R"));

        instructionSet.put(new StateTransition("rightv4", '0'), new Action('0', "rightv4", "R"));
        instructionSet.put(new StateTransition("rightv4", '1'), new Action('1', "rightv4", "R"));
        instructionSet.put(new StateTransition("rightv4", '_'), new Action('_', "decrement", "L"));

        instructionSet.put(new StateTransition("rightv5", '0'), new Action('0', "rightv5", "R"));
        instructionSet.put(new StateTransition("rightv5", '_'), new Action('_', "tidyv1", "L"));

        instructionSet.put(new StateTransition("tidyv1", '0'), new Action('_', "tidyv1", "L"));
        instructionSet.put(new StateTransition("tidyv1", '1'), new Action('_', "tidyv1", "L"));
        instructionSet.put(new StateTransition("tidyv1", '^'), new Action('_', "tidyv1", "L"));
        instructionSet.put(new StateTransition("tidyv1", '|'), new Action('_', "tidyv1", "L"));
        instructionSet.put(new StateTransition("tidyv1", 'B'), new Action('_', "tidyv2", "L"));

        instructionSet.put(new StateTransition("tidyv2", '0'), new Action('0', "tidyv2", "L"));
        instructionSet.put(new StateTransition("tidyv2", '1'), new Action('1', "tidyv2", "L"));
        instructionSet.put(new StateTransition("tidyv2", '*'), new Action('_', "doneExp", "R"));

        instructionSet.put(new StateTransition("doneExp", '_'), new Action('_', "h", "R"));

        instructionSet.put(new StateTransition("decrement", '_'), new Action('_', "decrement", "L"));
        instructionSet.put(new StateTransition("decrement", '1'), new Action('0', "leftv1", "L"));
        instructionSet.put(new StateTransition("decrement", '0'), new Action('1', "decrement", "L"));
        instructionSet.put(new StateTransition("decrement", '^'), new Action('^', "leftv1", "L"));

        instructionSet.put(new StateTransition("leftv1", '0'), new Action('0', "leftv1", "L"));
        instructionSet.put(new StateTransition("leftv1", '1'), new Action('1', "leftv1", "L"));
        instructionSet.put(new StateTransition("leftv1", '^'), new Action('^', "duplicateX", "L"));

        instructionSet.put(new StateTransition("duplicateX", '1'), new Action('@', "dup1", "L"));
        instructionSet.put(new StateTransition("duplicateX", '0'), new Action('@', "dup0", "L"));

        instructionSet.put(new StateTransition("dup1", '0'), new Action('0', "dup1", "L"));
        instructionSet.put(new StateTransition("dup1", '1'), new Action('1', "dup1", "L"));
        instructionSet.put(new StateTransition("dup1", '|'), new Action('|', "dup1", "L"));
        instructionSet.put(new StateTransition("dup1", '*'), new Action('*', "dup1", "L"));
        instructionSet.put(new StateTransition("dup1", 'B'), new Action('B', "dup1", "L"));
        instructionSet.put(new StateTransition("dup1", '_'), new Action('1', "backDup1", "R"));

        instructionSet.put(new StateTransition("dup0", '0'), new Action('0', "dup0", "L"));
        instructionSet.put(new StateTransition("dup0", '1'), new Action('1', "dup0", "L"));
        instructionSet.put(new StateTransition("dup0", '|'), new Action('|', "dup0", "L"));
        instructionSet.put(new StateTransition("dup0", '*'), new Action('*', "dup0", "L"));
        instructionSet.put(new StateTransition("dup0", 'B'), new Action('B', "dup0", "L"));
        instructionSet.put(new StateTransition("dup0", '_'), new Action('0', "backDup0", "R"));

        instructionSet.put(new StateTransition("backDup1", '@'), new Action('1', "duplicateX", "L"));
        instructionSet.put(new StateTransition("backDup1", '0'), new Action('0', "backDup1", "R"));
        instructionSet.put(new StateTransition("backDup1", '1'), new Action('1', "backDup1", "R"));
        instructionSet.put(new StateTransition("backDup1", '*'), new Action('*', "backDup1", "R"));
        instructionSet.put(new StateTransition("backDup1", 'B'), new Action('B', "backDup1", "R"));
        instructionSet.put(new StateTransition("backDup1", '|'), new Action('|', "checkDoneDupX1", "R"));

        instructionSet.put(new StateTransition("backDup0", '@'), new Action('0', "duplicateX", "L"));
        instructionSet.put(new StateTransition("backDup0", '0'), new Action('0', "backDup0", "R"));
        instructionSet.put(new StateTransition("backDup0", '1'), new Action('1', "backDup0", "R"));
        instructionSet.put(new StateTransition("backDup0", '*'), new Action('*', "backDup0", "R"));
        instructionSet.put(new StateTransition("backDup0", 'B'), new Action('B', "backDup0", "R"));
        instructionSet.put(new StateTransition("backDup0", '|'), new Action('|', "checkDoneDupX0", "R"));

        instructionSet.put(new StateTransition("checkDoneDupX1", '@'), new Action('1', "leftv2", "L"));
        instructionSet.put(new StateTransition("checkDoneDupX1", '0'), new Action('0', "backDup1", "R"));
        instructionSet.put(new StateTransition("checkDoneDupX1", '1'), new Action('1', "backDup1", "R"));
        instructionSet.put(new StateTransition("checkDoneDupX0", '@'), new Action('0', "leftv2", "L"));
        instructionSet.put(new StateTransition("checkDoneDupX0", '0'), new Action('0', "backDup0", "R"));
        instructionSet.put(new StateTransition("checkDoneDupX0", '1'), new Action('1', "backDup0", "R"));

        instructionSet.put(new StateTransition("leftv2", '0'), new Action('0', "leftv2", "L"));
        instructionSet.put(new StateTransition("leftv2", '1'), new Action('1', "leftv2", "L"));
        instructionSet.put(new StateTransition("leftv2", '*'), new Action('*', "leftv2", "L"));
        instructionSet.put(new StateTransition("leftv2", '|'), new Action('|', "leftv2", "L"));
        instructionSet.put(new StateTransition("leftv2", 'B'), new Action('B', "leftv2", "L"));
        instructionSet.put(new StateTransition("leftv2", '_'), new Action('_', "startMult", "R"));

        instructionSet.put(new StateTransition("doneMult", '0'), new Action('0', "leftv3", "L"));
        instructionSet.put(new StateTransition("doneMult", '1'), new Action('1', "leftv3", "L"));

        instructionSet.put(new StateTransition("leftv3", '0'), new Action('0', "leftv3", "L"));
        instructionSet.put(new StateTransition("leftv3", '1'), new Action('1', "leftv3", "L"));
        instructionSet.put(new StateTransition("leftv3", '_'), new Action('s', "rightv2", "R"));

        instructionSet.put(new StateTransition("rightv2", '0'), new Action('0', "rightv2", "R"));
        instructionSet.put(new StateTransition("rightv2", '1'), new Action('1', "rightv2", "R"));
        instructionSet.put(new StateTransition("rightv2", '_'), new Action('_', "shiftAns", "L"));
        instructionSet.put(new StateTransition("rightv2", 'B'), new Action('B', "rightv1", "R"));

        instructionSet.put(new StateTransition("shiftAns", '0'), new Action('b', "shiftAns0", "R"));
        instructionSet.put(new StateTransition("shiftAns", '1'), new Action('b', "shiftAns1", "R"));
        instructionSet.put(new StateTransition("shiftAns", 's'), new Action('_', "rightv3", "R"));

        instructionSet.put(new StateTransition("rightv3", '_'), new Action('_', "rightv3", "R"));
        instructionSet.put(new StateTransition("rightv3", '0'), new Action('0', "initv4", "L"));
        instructionSet.put(new StateTransition("rightv3", '1'), new Action('1', "initv4", "L"));

        instructionSet.put(new StateTransition("shiftAns0", '_'), new Action('_', "shiftAns0", "R"));
        instructionSet.put(new StateTransition("shiftAns0", '0'), new Action('0', "back1ShiftAns0", "L"));
        instructionSet.put(new StateTransition("shiftAns0", '1'), new Action('1', "back1ShiftAns0", "L"));
        instructionSet.put(new StateTransition("shiftAns0", 'B'), new Action('B', "back1ShiftAns0", "L"));

        instructionSet.put(new StateTransition("shiftAns1", '_'), new Action('_', "shiftAns1", "R"));
        instructionSet.put(new StateTransition("shiftAns1", '0'), new Action('0', "back1ShiftAns1", "L"));
        instructionSet.put(new StateTransition("shiftAns1", '1'), new Action('1', "back1ShiftAns1", "L"));
        instructionSet.put(new StateTransition("shiftAns1", 'B'), new Action('B', "back1ShiftAns1", "L"));

        instructionSet.put(new StateTransition("back1ShiftAns0", '_'), new Action('0', "backShiftAns", "L"));
        instructionSet.put(new StateTransition("back1ShiftAns1", '_'), new Action('1', "backShiftAns", "L"));

        instructionSet.put(new StateTransition("backShiftAns", '_'), new Action('_', "backShiftAns", "L"));
        instructionSet.put(new StateTransition("backShiftAns", 'b'), new Action('_', "shiftAns", "L"));
        instructionSet.put(new StateTransition("backShiftAns", '0'), new Action('0', "rightv2", "R"));
        instructionSet.put(new StateTransition("backShiftAns", '1'), new Action('1', "rightv2", "R"));

        instructionSet.put(new StateTransition("startMult", '0'), new Action('0', "initv0", "L"));
        instructionSet.put(new StateTransition("startMult", '1'), new Action('1', "initv0", "L"));

        instructionSet.put(new StateTransition("initv0", '_'), new Action('+', "rightv0", "R"));

        instructionSet.put(new StateTransition("rightv0", '0'), new Action('0', "rightv0", "R"));
        instructionSet.put(new StateTransition("rightv0", '1'), new Action('1', "rightv0", "R"));
        instructionSet.put(new StateTransition("rightv0", '*'), new Action('*', "rightv0", "R"));
        instructionSet.put(new StateTransition("rightv0", 'B'), new Action('B', "readB", "L"));

        instructionSet.put(new StateTransition("readB", '0'), new Action('_', "doubleL", "L"));
        instructionSet.put(new StateTransition("readB", '1'), new Action('_', "addA", "L"));

        instructionSet.put(new StateTransition("addA", '0'), new Action('0', "addA", "L"));
        instructionSet.put(new StateTransition("addA", '1'), new Action('1', "addA", "L"));
        instructionSet.put(new StateTransition("addA", '*'), new Action('*', "read", "L"));

        instructionSet.put(new StateTransition("doubleL", '0'), new Action('0', "doubleL", "L"));
        instructionSet.put(new StateTransition("doubleL", '1'), new Action('1', "doubleL", "L"));
        instructionSet.put(new StateTransition("doubleL", '*'), new Action('0', "shift", "R"));

        instructionSet.put(new StateTransition("double", '0'), new Action('0', "double", "R"));
        instructionSet.put(new StateTransition("double", '1'), new Action('1', "double", "R"));
        instructionSet.put(new StateTransition("double", '+'), new Action('+', "double", "R"));
        instructionSet.put(new StateTransition("double", '*'), new Action('0', "shift", "R"));

        instructionSet.put(new StateTransition("shift", '0'), new Action('*', "shift0", "R"));
        instructionSet.put(new StateTransition("shift", '1'), new Action('*', "shift1", "R"));
        instructionSet.put(new StateTransition("shift", '_'), new Action('_', "tidyv0", "L"));

        instructionSet.put(new StateTransition("shift0", '0'), new Action('0', "shift0", "R"));
        instructionSet.put(new StateTransition("shift0", '1'), new Action('0', "shift1", "R"));
        instructionSet.put(new StateTransition("shift0", '_'), new Action('0', "rightv0", "R"));

        instructionSet.put(new StateTransition("shift1", '0'), new Action('1', "shift0", "R"));
        instructionSet.put(new StateTransition("shift1", '1'), new Action('1', "shift1", "R"));
        instructionSet.put(new StateTransition("shift1", '_'), new Action('1', "rightv0", "R"));

        instructionSet.put(new StateTransition("tidyv0", '0'), new Action('_', "tidyv0", "L"));
        instructionSet.put(new StateTransition("tidyv0", '1'), new Action('_', "tidyv0", "L"));
        instructionSet.put(new StateTransition("tidyv0", '+'), new Action('_', "doneMult","L"));

        instructionSet.put(new StateTransition("read", '0'), new Action('c', "have0", "L"));
        instructionSet.put(new StateTransition("read", '1'), new Action('c', "have1", "L"));
        instructionSet.put(new StateTransition("read", '+'), new Action('+', "rewrite", "L"));

        instructionSet.put(new StateTransition("have0", '0'), new Action('0', "have0", "L"));
        instructionSet.put(new StateTransition("have0", '1'), new Action('1', "have0", "L"));
        instructionSet.put(new StateTransition("have0", '+'), new Action('+', "add0", "L"));

        instructionSet.put(new StateTransition("have1", '0'), new Action('0', "have1", "L"));
        instructionSet.put(new StateTransition("have1", '1'), new Action('1', "have1", "L"));
        instructionSet.put(new StateTransition("have1", '+'), new Action('+', "add1", "L"));

        instructionSet.put(new StateTransition("add0", '0'), new Action('$', "back0", "R"));
        instructionSet.put(new StateTransition("add0", '_'), new Action('$', "back0", "R"));
        instructionSet.put(new StateTransition("add0", '1'), new Action('&', "back0", "R"));
        instructionSet.put(new StateTransition("add0", '$'), new Action('$', "add0", "L"));
        instructionSet.put(new StateTransition("add0", '&'), new Action('&', "add0", "L"));

        instructionSet.put(new StateTransition("add1", '0'), new Action('&', "back1", "R"));
        instructionSet.put(new StateTransition("add1", '_'), new Action('&', "back1", "R"));
        instructionSet.put(new StateTransition("add1", '1'), new Action('$', "carry", "L"));
        instructionSet.put(new StateTransition("add1", '$'), new Action('$', "add1", "L"));
        instructionSet.put(new StateTransition("add1", '&'), new Action('&', "add1", "L"));

        instructionSet.put(new StateTransition("carry", '0'), new Action('1', "back1", "R"));
        instructionSet.put(new StateTransition("carry", '_'), new Action('1', "back1", "R"));
        instructionSet.put(new StateTransition("carry", '1'), new Action('0', "carry", "L"));

        instructionSet.put(new StateTransition("back0", '0'), new Action('0', "back0", "R"));
        instructionSet.put(new StateTransition("back0", '1'), new Action('1', "back0", "R"));
        instructionSet.put(new StateTransition("back0", '$'), new Action('$', "back0", "R"));
        instructionSet.put(new StateTransition("back0", '&'), new Action('&', "back0", "R"));
        instructionSet.put(new StateTransition("back0", '+'), new Action('+', "back0", "R"));
        instructionSet.put(new StateTransition("back0", 'c'), new Action('0', "read", "L"));

        instructionSet.put(new StateTransition("back1", '0'), new Action('0', "back1", "R"));
        instructionSet.put(new StateTransition("back1", '1'), new Action('1', "back1", "R"));
        instructionSet.put(new StateTransition("back1", '$'), new Action('$', "back1", "R"));
        instructionSet.put(new StateTransition("back1", '&'), new Action('&', "back1", "R"));
        instructionSet.put(new StateTransition("back1", '+'), new Action('+', "back1", "R"));
        instructionSet.put(new StateTransition("back1", 'c'), new Action('1', "read", "L"));

        instructionSet.put(new StateTransition("rewrite", '$'), new Action('0', "rewrite", "L"));
        instructionSet.put(new StateTransition("rewrite", '&'), new Action('1', "rewrite", "L"));
        instructionSet.put(new StateTransition("rewrite", '0'), new Action('0', "rewrite", "L"));
        instructionSet.put(new StateTransition("rewrite", '1'), new Action('1', "rewrite", "L"));
        instructionSet.put(new StateTransition("rewrite", '_'), new Action('_', "double", "R"));

        // Define the initial tape and start position
        String initialTape = "10^10";
        int startPosition = 0;

        // Create a Turing machine instance
        TuringMachine tm = new TuringMachine(initialTape, startPosition, instructionSet);

        // Perform the computation and write the result to the tape
        String result = tm.run();

        // Print the execution steps and the final tape
        tm.printSteps();
        System.out.println("Final Tape: " + result);
    }
}
