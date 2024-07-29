package com.banquito.core.bankdoc.model;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Document(collection = "bankUsers")
public class BankUser {

    @Id
    private String id;

    private String codeBank;

    private String uniqueId;

    private String nameBank;

    private String userName;

    private String lastName;

    private String fullName;

    private String typeUser;

    private String password;

    private LocalDateTime creationDate;

    private String state;

    private LocalDateTime lastLogin;

    private String email;

    public BankUser(String id, String codeBank, String uniqueId, String nameBank, String userName, String lastName,
            String fullName, String typeUser, String password, LocalDateTime creationDate, String state,
            LocalDateTime lastLogin, String email) {
        this.id = id;
        this.codeBank = codeBank;
        this.uniqueId = uniqueId;
        this.nameBank = nameBank;
        this.userName = userName;
        this.lastName = lastName;
        this.fullName = fullName;
        this.typeUser = typeUser;
        this.password = password;
        this.creationDate = creationDate;
        this.state = state;
        this.lastLogin = lastLogin;
        this.email = email;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        BankUser other = (BankUser) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }
}
