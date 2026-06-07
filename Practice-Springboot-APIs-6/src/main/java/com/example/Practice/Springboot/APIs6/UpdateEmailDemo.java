package com.example.Practice.Springboot.APIs6;

public class UpdateEmailDemo {
    public static void main(String[] args) {
        updateEmail();
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

        UserProfile user = new UserProfile(1001, 999997865, "Muscat, Oman");
    }

}
