package kopo.poly.persistance.mongodb;

import kopo.poly.dto.MelonDTO;

import java.util.List;

public interface IMelonMapper {
    int insertSong(List<MelonDTO> pList, String colNm) throws Exception;

    List<MelonDTO> getSongList(String colNm) throws Exception;

    List<MelonDTO> getSingerSongCnt(String colNm) throws Exception;

    List<MelonDTO> getSingerSong(String colNm, MelonDTO pDTO) throws Exception;

    int dropCollection(String colNm) throws Exception;

    int insertManyField(String colNm, List<MelonDTO> pList) throws Exception;
}
