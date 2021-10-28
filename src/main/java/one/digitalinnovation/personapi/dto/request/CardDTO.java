package one.digitalinnovation.personapi.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import one.digitalinnovation.personapi.enums.CardType;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CardDTO {

    private Long id;

    @NotEmpty
    private String number;

    @NotEmpty
    @Size(min = 16, max = 16)
    private String cvc;

    @NotEmpty
    private String expireDate;

    @Enumerated(EnumType.STRING)
    private CardType cardType;
}
