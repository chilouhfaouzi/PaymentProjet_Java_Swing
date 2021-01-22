package projetjava;

public  class  my_Session {
    public static int State ; //if 0 no one logged ,  1 if the are someoneLoged
    private static int id ;
    private static String username ;
    public static String Email ;
    public static String fullname ;
    public static String phoneStatic;
    public static int recharge =0;


    public static String getFullname() {
		return fullname;
	}

	public static void setFullname(String fullname) {
		my_Session.fullname = fullname;
	}

	public static int getRecharge() {
		return recharge;
	}

	public static void setRecharge(int recharge) {
		my_Session.recharge = recharge;
	}

	public static String getPhoneStatic() {
		return phoneStatic;
	}

	public static int getState() {
        return State;
    }

    public static String getPhone() {
		return phoneStatic;
	}

	public static void setPhoneStatic(String phoneStatic) {
		my_Session.phoneStatic = phoneStatic;
	}

	public static void setState(int state) {
        State = state;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
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
