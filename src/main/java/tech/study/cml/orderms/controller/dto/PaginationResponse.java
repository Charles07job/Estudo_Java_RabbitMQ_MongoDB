package tech.study.cml.orderms.controller.dto;

import org.springframework.data.domain.Page;

public record PaginationResponse(Integer page,
                                 Integer pageSize,
                                 Integer totalElements,
                                 Long totalPages) {

    public static PaginationResponse fromPage(Page<?> page) {
        return new PaginationResponse(
                page.getNumber(),
                page.getSize(),
                page.getTotalPages(),
                page.getTotalElements()
        );
    }
}
