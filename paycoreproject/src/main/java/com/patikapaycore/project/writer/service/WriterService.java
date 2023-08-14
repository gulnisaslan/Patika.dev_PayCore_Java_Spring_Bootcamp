package com.patikapaycore.project.writer.service;


import com.patikapaycore.project.writer.model.dto.WriterRequestDto;
import com.patikapaycore.project.writer.model.dto.WriterUpdateDto;
import com.patikapaycore.project.writer.model.dto.WriterResponseDto;
import com.patikapaycore.project.writer.model.entity.Writer;

import java.util.List;

public interface WriterService {

    List<WriterResponseDto> getAllWriter();

    WriterResponseDto getByWriterId(Integer id);
    Writer getByWriterId1(Integer id);

    WriterResponseDto addWriter(WriterRequestDto writerRequestDto);

    void updateWriter(WriterUpdateDto writerUpdateDto);

    boolean deleteWriter(Integer id);

}
