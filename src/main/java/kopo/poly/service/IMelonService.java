package kopo.poly.service;

import kopo.poly.dto.MelonDTO;

import java.util.List;

public interface IMelonService {

    int collectMelonSong() throws Exception;

    List<MelonDTO> getSongList() throws Exception;

    List<MelonDTO> getSingerSongCnt() throws Exception;

    List<MelonDTO> getSingerSong(MelonDTO pDTO) throws Exception;

    int dropCollection() throws Exception;

    List<MelonDTO> insertManyField() throws Exception;
}
