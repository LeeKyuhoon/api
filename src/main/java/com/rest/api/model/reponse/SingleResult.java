package com.rest.api.model.reponse;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SingleResult<T> extends CommonResult {
    private T data;
}