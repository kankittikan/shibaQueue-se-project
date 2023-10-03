package ku.cs.shibaqueuebackend.model;

import lombok.Data;

@Data
public class UserCreateMailConfirm {
    private String username;
    private String email;
    private String confirmLink;
}
