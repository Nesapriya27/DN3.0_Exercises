public class Main {
    public static void main(String[] args) {
        TaskManagementSystem taskSystem = new TaskManagementSystem();
        Task task1 = new Task("T001", "Finish report", "Incomplete");
        Task task2 = new Task("T002", "Update website", "Incomplete");
        Task task3 = new Task("T003", "Prepare presentation", "Incomplete");
        Task task4 = new Task("T004", "Organize meeting", "Incomplete");

        // Add tasks to the management system
        taskSystem.addTask(task1);
        taskSystem.addTask(task2);
        taskSystem.addTask(task3);
        taskSystem.addTask(task4);

        // Print all tasks
        System.out.println("All Tasks:");
        taskSystem.traverseTasks();

        // Search for a task by ID
        String searchId = "T003";
        Task foundTask = taskSystem.searchTask(searchId);
        if (foundTask != null) {
            System.out.println("\nTask found with ID " + searchId + ":");
            System.out.println(foundTask);
        } else {
            System.out.println("\nTask with ID " + searchId + " not found.");
        }

        // Delete a task by ID
        String deleteId = "T002";
        boolean deleted = taskSystem.deleteTask(deleteId);
        if (deleted) {
            System.out.println("\nTask with ID " + deleteId + " deleted successfully.");
        } else {
            System.out.println("\nTask with ID " + deleteId + " not found.");
        }

        // Print all tasks after deletion
        System.out.println("\nAll Tasks After Deletion:");
        taskSystem.traverseTasks();
    }
}
