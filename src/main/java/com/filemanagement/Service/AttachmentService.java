package com.filemanagement.Service;

import org.springframework.web.multipart.MultipartFile;

import com.filemanagement.Entity.Attachment;

public interface AttachmentService {

	Attachment saveAttachment(MultipartFile file) throws Exception;

	Attachment getAttachment(String fileId) throws Exception;

}
