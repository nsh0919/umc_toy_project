package umc.toy_project.apiPayload.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import umc.toy_project.apiPayload.code.BaseErrorCode;
import umc.toy_project.apiPayload.code.ErrorReasonDTO;

@Getter
@AllArgsConstructor
public class GeneralException extends RuntimeException {

    private BaseErrorCode code;

    public ErrorReasonDTO getErrorReason() {
        return this.code.getReason();
    }

    public ErrorReasonDTO getErrorReasonHttpStatus(){
        return this.code.getReasonHttpStatus();
    }
}
