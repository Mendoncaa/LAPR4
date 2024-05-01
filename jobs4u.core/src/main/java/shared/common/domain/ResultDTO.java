package shared.common.domain;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ResultDTO {

    private boolean error;

    private String result;

    public ResultDTO(String result) {
        this.result = result;
        this.error = false;
    }

    public ResultDTO(boolean error, String result) {
        this.result = result;
        this.error = error;
    }

    public boolean isError() {
        return error;
    }

    @Override
    public String toString() {
        return result;
    }
}
