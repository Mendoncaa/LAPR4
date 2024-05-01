package shared.common.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum Confirmation {
    YES ("Yes"),
    NO ("No");

    @Getter
    private final String description;
}