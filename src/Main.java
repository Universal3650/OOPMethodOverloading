// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        User customer = new User();
        customer.set_name("George");
        //You can now choose the enum variation from the public Enum in User Class.
        customer.set_membership(User.Membership.Gold);
        System.out.println(customer.get_name());
        System.out.println(customer.get_membership());



        }
}