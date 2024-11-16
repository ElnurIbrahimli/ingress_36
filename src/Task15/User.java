package Task15;

public class User {
    private String username;
    private String role;

    public User(String username) {
            this.username = username;
            this.role = "Guest";
        }
        public User(String username, String role) {
            this.username = username;

        }
        public String getUsername() {
            return username;
        }

        public String getRole() {
            return role;
        }

        @Override
        public String toString() {
            return "User{" +
                    "username='" + username + '\'' +
                    ", role='" + role + '\'' +
                    '}';
        }

        public void setRole(String role) {
            if (role.equals("Guest") || role.equals("Admin") || role.equals("User") ) {
                this.role = role;
            }else {
                throw new IllegalArgumentException("Rol yalnız 'Admin', 'User' və ya 'Guest' ola bilər.");
            }

}

    }

