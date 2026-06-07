package com.example.Practice.Springboot.APIs6;

public class UpdateEmailDemo {
    public static void main(String[] args) {
        updateEmail();
       updateUserProfile();
    }

    public static void updateEmail() {
        String oldEmail = "Ahmed@Example.com";
        String newEmail = "ahmed@example.com";
        boolean isUpdated;

        System.out.println("Original Email: " + oldEmail);

        if (!oldEmail.equalsIgnoreCase(newEmail)) {

            oldEmail = newEmail;

            isUpdated = true;

            System.out.println("Email updated successfully.");

        } else {

            isUpdated = false;

            System.out.println("No update required. Email address is already current."
            );
        }

        System.out.println("Updated Email: " + oldEmail);

        System.out.println("Update Status: " + isUpdated);
    }
    public static void updateUserProfile() {
        System.out.println("=== TASK 31 ===");

        UserProfile user = new UserProfile(1001, 999997865, "Muscat, Oman");
        //Display the original user profile information using getter methods
        System.out.println("Before Update");
        System.out.println("User ID: " + user.getUserId());
        System.out.println("Phone Number: " + user.getPhoneNumber());
        System.out.println("Address: " + user.getAddress());
    // update operation by changing phone + Address  using setter methods:
        user.setPhoneNumber(67894245);
        user.setAddress("ALSeeb, Muscat");
        System.out.println("\nAfter Update");
        //. Display the updated user profile information after modifications
        System.out.println("User ID: " + user.getUserId());
        System.out.println("Phone Number: " + user.getPhoneNumber());
        System.out.println("Address: " + user.getAddress());
    }}
}
        }

}
