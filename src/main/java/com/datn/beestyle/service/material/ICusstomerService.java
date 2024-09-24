package com.datn.beestyle.service.material;

import com.datn.beestyle.common.IGenericService;
import com.datn.beestyle.dto.PageResponse;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


public interface ICusstomerService  {
    PageResponse<?> searchByFullName(Pageable pageable, String fullname);
}
