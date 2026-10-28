void main() {
    String task1 = "Buy milk";
    String task2 = "Walk the dog";
    boolean task1Removed = false;
    boolean task2Removed = false;
    boolean task1Done = true;
    boolean task2Done = false;

    String status1 = "[ ]";
    if (task1Done) {
        status1 = "[x]";
    }
    String status2 = "[ ]";
    if (task2Done) {
        status2 = "[x]";
    }

    System.out.println("My Tasks:");

    for (int i = 0; i < 20; i++) {
        System.out.print("-");
    }
    
    System.out.println();

    if (!task1Removed) {
        System.out.println("1. " + status1 + " " + task1);
    }
    if (!task2Removed) {
        System.out.println("2. " + status2 + " " + task2);
    }
}
<<<<<<< HEAD

public static void listTasks() {
    for (int i = 0; i < tasks.size(); i++) {
        Task t = tasks.get(i);
        String status = t.done ? "X" : " ";
        System.out.println((i + 1) + ". [" + status + "] " + t.name);
    }
=======
public static void addTask(String taskName, String dueDate) {
    tasks.add(new Task(taskName));
    System.out.println("Added task: " + taskName + " (due " + dueDate + ")");
>>>>>>> 30612445be606702cc0bdb15cc6a8cf759d048c7
}
