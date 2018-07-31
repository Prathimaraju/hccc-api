package io.swagger.api;

import io.swagger.model.Course;
import io.swagger.model.CoursesList;
import io.swagger.model.ErrorResponse;
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
public class CoursesApiController implements CoursesApi {

    private static final Logger log = LoggerFactory.getLogger(CoursesApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public CoursesApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Course> addCourse(@ApiParam(value = "Unique identifier of the devotee's account" ,required=true) @RequestHeader(value="User-Name", required=true) String userName,@ApiParam(value = "" ,required=true )  @Valid @RequestBody Course body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Course>(objectMapper.readValue("{  \"courseName\" : \"courseName\",  \"courseTags\" : [ \"courseTags\", \"courseTags\" ],  \"courseImageURL\" : \"courseImageURL\",  \"ageRestrictions\" : \"ageRestrictions\",  \"courseId\" : \"courseId\",  \"courseRemarks\" : \"courseRemarks\"}", Course.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Course>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Course>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteCourseById(@ApiParam(value = "Unique identifier of the devotee's account" ,required=true) @RequestHeader(value="User-Name", required=true) String userName,@ApiParam(value = "Id of the course to be deleted",required=true) @PathVariable("courseId") String courseId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Course> getCourseById(@ApiParam(value = "Unique identifier of the devotee's account" ,required=true) @RequestHeader(value="User-Name", required=true) String userName,@ApiParam(value = "Id of the course to be retrieved",required=true) @PathVariable("courseId") String courseId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Course>(objectMapper.readValue("{  \"courseName\" : \"courseName\",  \"courseTags\" : [ \"courseTags\", \"courseTags\" ],  \"courseImageURL\" : \"courseImageURL\",  \"ageRestrictions\" : \"ageRestrictions\",  \"courseId\" : \"courseId\",  \"courseRemarks\" : \"courseRemarks\"}", Course.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Course>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Course>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<CoursesList> getCourses(@ApiParam(value = "Unique identifier of the devotee's account" ,required=true) @RequestHeader(value="User-Name", required=true) String userName,@ApiParam(value = "Tags to be used as filter - comma seperated list of tags") @Valid @RequestParam(value = "courseTags", required = false) String courseTags) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<CoursesList>(objectMapper.readValue("{  \"courses\" : [ {    \"courseName\" : \"courseName\",    \"courseTags\" : [ \"courseTags\", \"courseTags\" ],    \"courseImageURL\" : \"courseImageURL\",    \"ageRestrictions\" : \"ageRestrictions\",    \"courseId\" : \"courseId\",    \"courseRemarks\" : \"courseRemarks\"  }, {    \"courseName\" : \"courseName\",    \"courseTags\" : [ \"courseTags\", \"courseTags\" ],    \"courseImageURL\" : \"courseImageURL\",    \"ageRestrictions\" : \"ageRestrictions\",    \"courseId\" : \"courseId\",    \"courseRemarks\" : \"courseRemarks\"  } ]}", CoursesList.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<CoursesList>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<CoursesList>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updateCourse(@ApiParam(value = "Unique identifier of the devotee's account" ,required=true) @RequestHeader(value="User-Name", required=true) String userName,@ApiParam(value = "Id of the course to be updated",required=true) @PathVariable("courseId") String courseId,@ApiParam(value = "" ,required=true )  @Valid @RequestBody Course body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
