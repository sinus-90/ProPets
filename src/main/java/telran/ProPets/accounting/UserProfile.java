package telran.ProPets.accounting;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

public class UserProfile {
    String userEmail;
    String name;
    String hashCode;
    LocalDate actvationDate;
    Boolean revoked;
    String phone;
    String userPhoto;
    Set<String> roles;
    List<Long> activities;
    List<Long> favorites;
}