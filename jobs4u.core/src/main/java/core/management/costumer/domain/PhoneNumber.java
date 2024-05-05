package core.management.costumer.domain;

import shared.exception.RuleViolationException;
import jakarta.persistence.Embeddable;
import eapli.framework.domain.model.ValueObject;
import lombok.Getter;

import java.util.regex.Pattern;

@Embeddable
@Getter
public class PhoneNumber implements ValueObject, Comparable<PhoneNumber> {

    private static final long serialVersionUID = 1L;

    private String number;

    public PhoneNumber(final String phoneNumber) {
        if (!isValidPhoneNumber(phoneNumber)) {
            throw new IllegalArgumentException(
                    "Phone Number is not valid");
        }
        this.number = phoneNumber;
    }

    public static PhoneNumber from(String phoneNumber) throws RuleViolationException {
        return new PhoneNumber(phoneNumber);
    }

    protected PhoneNumber() {
        // for ORM
    }

    public static PhoneNumber valueOf(final String phoneNumber) {
        return new PhoneNumber(phoneNumber);
    }

    private boolean isValidPhoneNumber(String phoneNumber) {
        String regex = "\\d{9}";
        Pattern pattern = Pattern.compile(regex);
        return pattern.matcher(phoneNumber).matches();
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PhoneNumber)) {
            return false;
        }

        final PhoneNumber that = (PhoneNumber) o;
        return this.number.equals(that.number);
    }

    @Override
    public int hashCode() {
        return this.number.hashCode();
    }

    @Override
    public String toString() {
        return this.number;
    }

    @Override
    public int compareTo(final PhoneNumber arg0) {
        return number.compareTo(arg0.number);
    }
}