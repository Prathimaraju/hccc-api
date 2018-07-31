package io.swagger.api;

import io.swagger.model.ClassesList;
import io.swagger.model.ErrorResponse;
import io.swagger.model.ModelClass;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-07-30T23:06:14.797-07:00")

@Controller
public class ClassesApiController implements ClassesApi {

    private static final Logger log = LoggerFactory.getLogger(ClassesApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ClassesApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<ModelClass> addClass(@ApiParam(value = "Unique identifier of the devotee's account" ,required=true) @RequestHeader(value="User-Name", required=true) String userName,@ApiParam(value = "" ,required=true )  @Valid @RequestBody ModelClass body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ModelClass>(objectMapper.readValue("{  \"courseEndTime\" : \"courseEndTime\",  \"classId\" : \"classId\",  \"slots\" : 0,  \"courseVenue\" : \"courseVenue\",  \"teachers\" : [ \"teachers\", \"teachers\" ],  \"flyerURL\" : \"flyerURL\",  \"courseStartTime\" : \"courseStartTime\",  \"courseEndDate\" : \"courseEndDate\",  \"courseId\" : \"courseId\",  \"courseStartDate\" : \"courseStartDate\",  \"courseDays\" : \"courseDays\"}", ModelClass.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ModelClass>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ModelClass>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteClassById(@ApiParam(value = "Unique identifier of the devotee's account" ,required=true) @RequestHeader(value="User-Name", required=true) String userName,@ApiParam(value = "Id of the class to be deleted",required=true) @PathVariable("classId") String classId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ModelClass> getClassById(@ApiParam(value = "Unique identifier of the devotee's account" ,required=true) @RequestHeader(value="User-Name", required=true) String userName,@ApiParam(value = "Id of the class to be retrieved",required=true) @PathVariable("classId") String classId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ModelClass>(objectMapper.readValue("{  \"courseEndTime\" : \"courseEndTime\",  \"classId\" : \"classId\",  \"slots\" : 0,  \"courseVenue\" : \"courseVenue\",  \"teachers\" : [ \"teachers\", \"teachers\" ],  \"flyerURL\" : \"flyerURL\",  \"courseStartTime\" : \"courseStartTime\",  \"courseEndDate\" : \"courseEndDate\",  \"courseId\" : \"courseId\",  \"courseStartDate\" : \"courseStartDate\",  \"courseDays\" : \"courseDays\"}", ModelClass.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ModelClass>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ModelClass>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ClassesList> getClasses(@ApiParam(value = "Unique identifier of the devotee's account" ,required=true) @RequestHeader(value="User-Name", required=true) String userName,@ApiParam(value = "Course Tags to be used as filter classes - comma seperated list of tags") @Valid @RequestParam(value = "courseTags", required = false) String courseTags) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ClassesList>(objectMapper.readValue("{  \"classes\" : [ {    \"courseEndTime\" : \"courseEndTime\",    \"classId\" : \"classId\",    \"slots\" : 0,    \"courseVenue\" : \"courseVenue\",    \"teachers\" : [ \"teachers\", \"teachers\" ],    \"flyerURL\" : \"flyerURL\",    \"courseStartTime\" : \"courseStartTime\",    \"courseEndDate\" : \"courseEndDate\",    \"courseId\" : \"courseId\",    \"courseStartDate\" : \"courseStartDate\",    \"courseDays\" : \"courseDays\"  }, {    \"courseEndTime\" : \"courseEndTime\",    \"classId\" : \"classId\",    \"slots\" : 0,    \"courseVenue\" : \"courseVenue\",    \"teachers\" : [ \"teachers\", \"teachers\" ],    \"flyerURL\" : \"flyerURL\",    \"courseStartTime\" : \"courseStartTime\",    \"courseEndDate\" : \"courseEndDate\",    \"courseId\" : \"courseId\",    \"courseStartDate\" : \"courseStartDate\",    \"courseDays\" : \"courseDays\"  } ]}", ClassesList.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ClassesList>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ClassesList>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updateClass(@ApiParam(value = "Unique identifier of the devotee's account" ,required=true) @RequestHeader(value="User-Name", required=true) String userName,@ApiParam(value = "Id of the class to be updated",required=true) @PathVariable("classId") String classId,@ApiParam(value = "" ,required=true )  @Valid @RequestBody ModelClass body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
