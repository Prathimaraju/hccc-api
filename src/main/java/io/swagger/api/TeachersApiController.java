package io.swagger.api;

import io.swagger.model.ErrorResponse;
import io.swagger.model.Teacher;
import io.swagger.model.TeachersList;
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
public class TeachersApiController implements TeachersApi {

    private static final Logger log = LoggerFactory.getLogger(TeachersApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public TeachersApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> deleteTeacherById(@ApiParam(value = "Unique identifier of the devotee's account" ,required=true) @RequestHeader(value="User-Name", required=true) String userName,@ApiParam(value = "Id of the teacher to be deleted",required=true) @PathVariable("teacherId") String teacherId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Teacher> getTeacherById(@ApiParam(value = "Unique identifier of the devotee's account" ,required=true) @RequestHeader(value="User-Name", required=true) String userName,@ApiParam(value = "Id of the teacher to be retrieved",required=true) @PathVariable("teacherId") String teacherId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Teacher>(objectMapper.readValue("{  \"profilePictureURL\" : \"profilePictureURL\",  \"skillSet\" : [ \"skillSet\", \"skillSet\" ],  \"indemnitySigned\" : true,  \"salutation\" : \"salutation\",  \"identityVerified\" : true,  \"account\" : {    \"phoneNumber\" : \"phoneNumber\",    \"roles\" : [ \"roles\", \"roles\" ],    \"devoteeId\" : \"devoteeId\",    \"name\" : {      \"firstName\" : \"firstName\",      \"lastName\" : \"lastName\",      \"middleName\" : \"middleName\"    },    \"email\" : \"email\"  },  \"backgroundVerified\" : true}", Teacher.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Teacher>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Teacher>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TeachersList> getTeachers(@ApiParam(value = "Unique identifier of the devotee's account" ,required=true) @RequestHeader(value="User-Name", required=true) String userName) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TeachersList>(objectMapper.readValue("{  \"teachers\" : [ {    \"profilePictureURL\" : \"profilePictureURL\",    \"skillSet\" : [ \"skillSet\", \"skillSet\" ],    \"indemnitySigned\" : true,    \"salutation\" : \"salutation\",    \"identityVerified\" : true,    \"account\" : {      \"phoneNumber\" : \"phoneNumber\",      \"roles\" : [ \"roles\", \"roles\" ],      \"devoteeId\" : \"devoteeId\",      \"name\" : {        \"firstName\" : \"firstName\",        \"lastName\" : \"lastName\",        \"middleName\" : \"middleName\"      },      \"email\" : \"email\"    },    \"backgroundVerified\" : true  }, {    \"profilePictureURL\" : \"profilePictureURL\",    \"skillSet\" : [ \"skillSet\", \"skillSet\" ],    \"indemnitySigned\" : true,    \"salutation\" : \"salutation\",    \"identityVerified\" : true,    \"account\" : {      \"phoneNumber\" : \"phoneNumber\",      \"roles\" : [ \"roles\", \"roles\" ],      \"devoteeId\" : \"devoteeId\",      \"name\" : {        \"firstName\" : \"firstName\",        \"lastName\" : \"lastName\",        \"middleName\" : \"middleName\"      },      \"email\" : \"email\"    },    \"backgroundVerified\" : true  } ]}", TeachersList.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TeachersList>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TeachersList>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Teacher> onboardTeacher(@ApiParam(value = "Unique identifier of the devotee's account" ,required=true) @RequestHeader(value="User-Name", required=true) String userName,@ApiParam(value = "" ,required=true )  @Valid @RequestBody Teacher body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Teacher>(objectMapper.readValue("{  \"profilePictureURL\" : \"profilePictureURL\",  \"skillSet\" : [ \"skillSet\", \"skillSet\" ],  \"indemnitySigned\" : true,  \"salutation\" : \"salutation\",  \"identityVerified\" : true,  \"account\" : {    \"phoneNumber\" : \"phoneNumber\",    \"roles\" : [ \"roles\", \"roles\" ],    \"devoteeId\" : \"devoteeId\",    \"name\" : {      \"firstName\" : \"firstName\",      \"lastName\" : \"lastName\",      \"middleName\" : \"middleName\"    },    \"email\" : \"email\"  },  \"backgroundVerified\" : true}", Teacher.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Teacher>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Teacher>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updateTeacher(@ApiParam(value = "Unique identifier of the devotee's account" ,required=true) @RequestHeader(value="User-Name", required=true) String userName,@ApiParam(value = "Id of the teacher to be updated",required=true) @PathVariable("teacherId") String teacherId,@ApiParam(value = "" ,required=true )  @Valid @RequestBody Teacher body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
