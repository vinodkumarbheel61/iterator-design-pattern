public class Main {
    public static void main(String[] args) {

        UserManagement userManagement = new UserManagement();
        userManagement.addUser(new User("vinod", "12"));
        userManagement.addUser(new User("asmat", "13"));
        userManagement.addUser(new User("ashok", "14"));

        MyIterator myIterator = userManagement.getIterator();
        while (myIterator.hasNext()) {
            User user = (User) myIterator.next();
            System.out.println(user.getName());
        }

    }
}
