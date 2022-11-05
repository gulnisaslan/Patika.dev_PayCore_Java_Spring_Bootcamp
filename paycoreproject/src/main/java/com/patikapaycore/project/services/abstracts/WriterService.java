package com.patikapaycore.project.services.abstracts;


import com.patikapaycore.project.dtos.request.WriterRequestDto;
import com.patikapaycore.project.dtos.response.WriterResponseDto;
import com.patikapaycore.project.models.entities.Writer;

import java.util.List;

public interface WriterService {

    List<WriterResponseDto> getAllWriter();

    WriterResponseDto getByWriterId(Integer id);
    Writer getByWriterId1(Integer id);

    WriterResponseDto addWriter(WriterRequestDto writerRequestDto);

    void updateWriter(WriterRequestDto writerRequestDto);

    boolean deleteWriter(Integer id);

}
