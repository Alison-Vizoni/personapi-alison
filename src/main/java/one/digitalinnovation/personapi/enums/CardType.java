package one.digitalinnovation.personapi.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum CardType {

    CREDIT("Credit"),
    DEBIT("Debit");

    private final String description;
}
