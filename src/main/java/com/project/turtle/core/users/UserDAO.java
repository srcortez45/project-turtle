package com.project.turtle.core.users;

import java.time.LocalDate;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class UserDAO {

        @Id
        @Column(name= "id")
        @Getter @Setter
        private long id;

        @Column(name= "group_id")
        @Getter @Setter
        private long groupId;

        @Column(name= "username",
                length = 100)

        @Getter @Setter
        private String username;

        @Column(name = "email",
                length = 100)
        @Getter @Setter
        private String email;

        @Column(name = "mobile",
        length = 20)
        @Getter @Setter
        private String mobile;

        @Column(name = "dob",
        length = 20)
        @Getter @Setter
        private LocalDate dateOfBirth;

        @Column(name = "sex",
        length = 10)
        @Getter @Setter
        private String sex;

        @Column(name = "password",
        length = 100)
        @Getter @Setter
        private String pass;

        @Column(name = "raw_password",
        length = 100)
        @Getter @Setter
        private String rawPass;
        
        @Column(name = "pass_reset_code",
        length = 32)
        @Getter @Setter
        private String resetCode;

        @Column(name = "reset_code_time",
        length = 32)
        @Getter @Setter
        private Date resetCodeTime;

        @Column(name = "login_try")
        @Getter @Setter
        private int loginAttempt;

        @Column(name = "last_login")
        @Getter @Setter
        private Date lastLogin;

        @Column(name = "ip",
        length = 40)
        @Getter @Setter
        private String ip;

        @Column(name = "address",
        length = 200)
        @Getter @Setter
        private String address;

        @Column(name = "preference",
        length = 200)
        @Getter @Setter
        private String preference;
        
        @Column(name = "user_image",
        length = 200)
        @Getter @Setter
        private String userImage;

        @Column(name = "created_at")
        @Getter @Setter
        private Date createAt;

        @Column(name = "updated_at")
        @Getter @Setter
        private Date updatedAt;

}