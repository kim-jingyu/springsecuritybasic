package com.eazybytes.repository;

import com.eazybytes.model.Notice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface NoticeRepository extends JpaRepository<Notice, Long> {
    @Query(value = "from Notice n where CURDATE() between noticeBegDt and noticeEndDt")
    List<Notice> findAllActiveNotices();
}
