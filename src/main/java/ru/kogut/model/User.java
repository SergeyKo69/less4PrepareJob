package ru.kogut.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

/**
 * @author S.Kogut on 2019-03-24
 */

@Getter
@Setter
@NoArgsConstructor
public class User {

    private String id = UUID.randomUUID().toString();

    private String name;

    private String login;

    private String password;

    private String eMail;

}
