package io.khasang.teamnote.model;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

/**
 * @author d.grushetskiy
 */
@Component
public class FileValidator implements Validator {
    @Override
    public boolean supports(Class<?> aClass) {
        return FileBucket.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object obj, Errors errors) {
        FileBucket file = (FileBucket) obj;

        if(file.getFile()!=null){
            if (file.getFile().getSize() == 0) {
                errors.rejectValue("file", "missing.file");
            }
        }
    }
}
