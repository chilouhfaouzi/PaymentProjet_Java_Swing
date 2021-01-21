package projetjava;

public  class  my_Session {
    public static int State ; //if 0 no one logged ,  1 if the are someoneLoged
    private static String id ;
    private static String username ;
    public static String Email ;
    public static String fullname ;
    public static String phoneStatic;


    public static int getState() {
        return State;
    }

    public static void setState(int state) {
        State = state;
    }

    public static String getId() {
        return id;
    }

    public static void setId(String id) {
        my_Session.id = id;
    }

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        my_Session.username = username;
    }

    public static String getEmail() {
        return Email;
    }

    public static void setEmail(String email) {
        Email = email;
    }
}
