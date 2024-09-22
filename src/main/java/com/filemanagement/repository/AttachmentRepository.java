package com.filemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.filemanagement.Entity.Attachment;

@Repository
public interface AttachmentRepository extends JpaRepository<Attachment, String> {

}
