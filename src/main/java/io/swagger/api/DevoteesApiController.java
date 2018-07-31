package io.swagger.api;

import io.swagger.model.DevoteeDetails;
import io.swagger.model.DevoteesList;
import io.swagger.model.Enrollment;
import io.swagger.model.EnrollmentsList;
import io.swagger.model.ErrorResponse;
import io.swagger.model.IndemnitiesList;
import io.swagger.model.Indemnity;
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
public class DevoteesApiController implements DevoteesApi {

    private static final Logger log = LoggerFactory.getLogger(DevoteesApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public DevoteesApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Enrollment> addEnrollment(@ApiParam(value = "Unique identifier of the devotee's account" ,required=true) @RequestHeader(value="User-Name", required=true) String userName,@ApiParam(value = "Id of the account to be retrieved",required=true) @PathVariable("devoteeId") String devoteeId,@ApiParam(value = "" ,required=true )  @Valid @RequestBody Enrollment body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Enrollment>(objectMapper.readValue("{  \"enrollmentId\" : \"enrollmentId\",  \"familyMemberId\" : \"familyMemberId\",  \"indemnityIds\" : [ \"indemnityIds\", \"indemnityIds\" ],  \"devoteeId\" : \"devoteeId\",  \"ClassId\" : \"ClassId\",  \"isParticipantUnder18\" : true}", Enrollment.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Enrollment>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Enrollment>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Indemnity> addIndemnity(@ApiParam(value = "Unique identifier of the devotee's account" ,required=true) @RequestHeader(value="User-Name", required=true) String userName,@ApiParam(value = "Id of the devotee",required=true) @PathVariable("devoteeId") String devoteeId,@ApiParam(value = "" ,required=true )  @Valid @RequestBody Indemnity body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Indemnity>(objectMapper.readValue("{  \"signedFor\" : \"signedFor\",  \"signedBy\" : \"signedBy\",  \"devoteeId\" : \"devoteeId\",  \"indemnityFormId\" : \"indemnityFormId\",  \"indemnityId\" : \"indemnityId\",  \"signedOn\" : \"signedOn\"}", Indemnity.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Indemnity>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Indemnity>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteEnrollmentById(@ApiParam(value = "Unique identifier of the devotee's account" ,required=true) @RequestHeader(value="User-Name", required=true) String userName,@ApiParam(value = "Id of the devotee",required=true) @PathVariable("devoteeId") String devoteeId,@ApiParam(value = "Id of the enrollment to be deleted",required=true) @PathVariable("enrollmentId") String enrollmentId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteIndemnityById(@ApiParam(value = "Unique identifier of the devotee's account" ,required=true) @RequestHeader(value="User-Name", required=true) String userName,@ApiParam(value = "Id of the devotee",required=true) @PathVariable("devoteeId") String devoteeId,@ApiParam(value = "Id of the indemnity to be deleted",required=true) @PathVariable("indemnityId") String indemnityId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<DevoteeDetails> getDevotee(@ApiParam(value = "Unique identifier of the devotee's account" ,required=true) @RequestHeader(value="User-Name", required=true) String userName,@ApiParam(value = "Id of the devotee to be retrieved",required=true) @PathVariable("devoteeId") String devoteeId,@ApiParam(value = "?include=familyMember will return devotee devotee information with family members details") @Valid @RequestParam(value = "include", required = false) String include) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<DevoteeDetails>(objectMapper.readValue("{  \"phoneNumber\" : \"phoneNumber\",  \"roles\" : [ \"roles\", \"roles\" ],  \"devoteeId\" : \"devoteeId\",  \"name\" : {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"middleName\" : \"middleName\"  },  \"familyMembers\" : [ {    \"familyMemberId\" : \"familyMemberId\",    \"familyMemberName\" : {      \"firstName\" : \"firstName\",      \"lastName\" : \"lastName\",      \"middleName\" : \"middleName\"    }  }, {    \"familyMemberId\" : \"familyMemberId\",    \"familyMemberName\" : {      \"firstName\" : \"firstName\",      \"lastName\" : \"lastName\",      \"middleName\" : \"middleName\"    }  } ],  \"email\" : \"email\"}", DevoteeDetails.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<DevoteeDetails>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<DevoteeDetails>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<DevoteesList> getDevotees(@ApiParam(value = "Unique identifier of the devotee's account" ,required=true) @RequestHeader(value="User-Name", required=true) String userName,@ApiParam(value = "?include=familyMember will return devotee devotee information with family members details") @Valid @RequestParam(value = "include", required = false) String include,@ApiParam(value = "If a phone number is passed in query string, the results will be filtered by accounts mobile number") @Valid @RequestParam(value = "phoneNumber", required = false) String phoneNumber,@ApiParam(value = "If a role is passed in query string, the results will be filtered by roles") @Valid @RequestParam(value = "role", required = false) String role) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<DevoteesList>(objectMapper.readValue("{  \"devotees\" : [ {    \"phoneNumber\" : \"phoneNumber\",    \"roles\" : [ \"roles\", \"roles\" ],    \"devoteeId\" : \"devoteeId\",    \"name\" : {      \"firstName\" : \"firstName\",      \"lastName\" : \"lastName\",      \"middleName\" : \"middleName\"    },    \"email\" : \"email\"  }, {    \"phoneNumber\" : \"phoneNumber\",    \"roles\" : [ \"roles\", \"roles\" ],    \"devoteeId\" : \"devoteeId\",    \"name\" : {      \"firstName\" : \"firstName\",      \"lastName\" : \"lastName\",      \"middleName\" : \"middleName\"    },    \"email\" : \"email\"  } ]}", DevoteesList.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<DevoteesList>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<DevoteesList>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Enrollment> getEnrollment(@ApiParam(value = "Unique identifier of the devotee's account" ,required=true) @RequestHeader(value="User-Name", required=true) String userName,@ApiParam(value = "Id of the devotee",required=true) @PathVariable("devoteeId") String devoteeId,@ApiParam(value = "Id of the enrollment to be retrieved",required=true) @PathVariable("enrollmentId") String enrollmentId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Enrollment>(objectMapper.readValue("{  \"enrollmentId\" : \"enrollmentId\",  \"familyMemberId\" : \"familyMemberId\",  \"indemnityIds\" : [ \"indemnityIds\", \"indemnityIds\" ],  \"devoteeId\" : \"devoteeId\",  \"ClassId\" : \"ClassId\",  \"isParticipantUnder18\" : true}", Enrollment.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Enrollment>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Enrollment>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<EnrollmentsList> getEnrollments(@ApiParam(value = "Unique identifier of the devotee's account" ,required=true) @RequestHeader(value="User-Name", required=true) String userName,@ApiParam(value = "Id of the devotee account whose enrollments are to be retrieved",required=true) @PathVariable("devoteeId") String devoteeId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<EnrollmentsList>(objectMapper.readValue("{  \"enrollments\" : [ {    \"enrollmentId\" : \"enrollmentId\",    \"familyMemberId\" : \"familyMemberId\",    \"indemnityIds\" : [ \"indemnityIds\", \"indemnityIds\" ],    \"devoteeId\" : \"devoteeId\",    \"ClassId\" : \"ClassId\",    \"isParticipantUnder18\" : true  }, {    \"enrollmentId\" : \"enrollmentId\",    \"familyMemberId\" : \"familyMemberId\",    \"indemnityIds\" : [ \"indemnityIds\", \"indemnityIds\" ],    \"devoteeId\" : \"devoteeId\",    \"ClassId\" : \"ClassId\",    \"isParticipantUnder18\" : true  } ]}", EnrollmentsList.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<EnrollmentsList>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<EnrollmentsList>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<IndemnitiesList> getIndemnities(@ApiParam(value = "Unique identifier of the devotee's account" ,required=true) @RequestHeader(value="User-Name", required=true) String userName,@ApiParam(value = "Id of the devotee account whose indemnities are to be retrieved",required=true) @PathVariable("devoteeId") String devoteeId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<IndemnitiesList>(objectMapper.readValue("{  \"indemnities\" : [ {    \"signedFor\" : \"signedFor\",    \"signedBy\" : \"signedBy\",    \"devoteeId\" : \"devoteeId\",    \"indemnityFormId\" : \"indemnityFormId\",    \"indemnityId\" : \"indemnityId\",    \"signedOn\" : \"signedOn\"  }, {    \"signedFor\" : \"signedFor\",    \"signedBy\" : \"signedBy\",    \"devoteeId\" : \"devoteeId\",    \"indemnityFormId\" : \"indemnityFormId\",    \"indemnityId\" : \"indemnityId\",    \"signedOn\" : \"signedOn\"  } ]}", IndemnitiesList.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<IndemnitiesList>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<IndemnitiesList>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Indemnity> getIndemnity(@ApiParam(value = "Unique identifier of the devotee's account" ,required=true) @RequestHeader(value="User-Name", required=true) String userName,@ApiParam(value = "Id of the devotee",required=true) @PathVariable("devoteeId") String devoteeId,@ApiParam(value = "Id of the indemnity to be retrieved",required=true) @PathVariable("indemnityId") String indemnityId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Indemnity>(objectMapper.readValue("{  \"signedFor\" : \"signedFor\",  \"signedBy\" : \"signedBy\",  \"devoteeId\" : \"devoteeId\",  \"indemnityFormId\" : \"indemnityFormId\",  \"indemnityId\" : \"indemnityId\",  \"signedOn\" : \"signedOn\"}", Indemnity.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Indemnity>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Indemnity>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updateEnrollment(@ApiParam(value = "Unique identifier of the devotee's account" ,required=true) @RequestHeader(value="User-Name", required=true) String userName,@ApiParam(value = "Id of the devotee",required=true) @PathVariable("devoteeId") String devoteeId,@ApiParam(value = "Id of the enrollment to be retrieved",required=true) @PathVariable("enrollmentId") String enrollmentId,@ApiParam(value = "" ,required=true )  @Valid @RequestBody Enrollment body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updateIndemnity(@ApiParam(value = "Unique identifier of the devotee's account" ,required=true) @RequestHeader(value="User-Name", required=true) String userName,@ApiParam(value = "Id of the devotee",required=true) @PathVariable("devoteeId") String devoteeId,@ApiParam(value = "Id of the indemnity to be retrieved",required=true) @PathVariable("indemnityId") String indemnityId,@ApiParam(value = "" ,required=true )  @Valid @RequestBody Indemnity body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
