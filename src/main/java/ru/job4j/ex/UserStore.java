package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        for (User tmp : users) {
            if (login.equals(tmp.getUsername())) {
                return tmp;
            }
        }
        throw new UserNotFoundException("User " + login + " does not exist");
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValid() || user.getUsername().length() < 3) {
            throw new UserInvalidException("Invalid user");
        }
        return true;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", true)
        };
        User user = null;
        try {
            User user1 = findUser(users, "Petr Arsentev");
            if (user != null && validate(user)) {
                System.out.println("This user has an access ");
            }
        } catch (UserInvalidException e) {
            e.printStackTrace();
        } catch (UserNotFoundException e) {
            e.printStackTrace();
        }
    }
}
