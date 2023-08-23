public class User {
    private String _name;
    private String _membership;

    void set_name(String name){
        _name = name;
    }

    String get_name() {
        return _name;
    }
    void set_membership(String membership){
        _membership = _membership;
    }

    void set_membership(Membership membership){
        _membership = membership.name();
    }
    //The enum is used to help select different variations of the membership.
    public enum Membership {
        Bronze,Silver,Gold;

    }
    String get_membership(){
        return _membership;
    }



}
