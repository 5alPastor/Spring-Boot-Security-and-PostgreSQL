package com.botman.security.user;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity //necesita ser Jakarta persistance y no java x . persistance
@Table(name = "_user")
public class User {
    @Id //esto dice que este id es el identificador unico de esta clase
    @GeneratedValue(strategy = GenerationType.IDENTITY)//para que sea auto
    private Integer id;
    private String firstname;
    private String lastname;
    private String email;
    private String password;

}