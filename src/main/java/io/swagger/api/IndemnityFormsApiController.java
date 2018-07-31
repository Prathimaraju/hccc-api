package io.swagger.api;

import io.swagger.model.ErrorResponse;
import io.swagger.model.IndemnityForm;
import io.swagger.model.IndemnityFormsList;
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
public class IndemnityFormsApiController implements IndemnityFormsApi {

    private static final Logger log = LoggerFactory.getLogger(IndemnityFormsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public IndemnityFormsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<IndemnityForm> addIndemnityForm(@ApiParam(value = "Unique identifier of the devotee's account" ,required=true) @RequestHeader(value="User-Name", required=true) String userName,@ApiParam(value = "" ,required=true )  @Valid @RequestBody IndemnityForm body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<IndemnityForm>(objectMapper.readValue("{  \"indemnityFormTitle\" : \"indemnityFormTitle\",  \"indemnityFormId\" : \"indemnityFormId\",  \"indemnityFormURL\" : \"indemnityFormURL\",  \"indemnityFormDescription\" : \"indemnityFormDescription\",  \"indemnityFormVersion\" : \"indemnityFormVersion\"}", IndemnityForm.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<IndemnityForm>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<IndemnityForm>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteIndemnityFormrById(@ApiParam(value = "Unique identifier of the devotee's account" ,required=true) @RequestHeader(value="User-Name", required=true) String userName,@ApiParam(value = "Id of the indemnity form to be deleted",required=true) @PathVariable("indemnityFormId") String indemnityFormId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<IndemnityForm> getIndemnityFormById(@ApiParam(value = "Unique identifier of the devotee's account" ,required=true) @RequestHeader(value="User-Name", required=true) String userName,@ApiParam(value = "Id of the indemnity from to be retrieved",required=true) @PathVariable("indemnityFormId") String indemnityFormId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<IndemnityForm>(objectMapper.readValue("{  \"indemnityFormTitle\" : \"indemnityFormTitle\",  \"indemnityFormId\" : \"indemnityFormId\",  \"indemnityFormURL\" : \"indemnityFormURL\",  \"indemnityFormDescription\" : \"indemnityFormDescription\",  \"indemnityFormVersion\" : \"indemnityFormVersion\"}", IndemnityForm.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<IndemnityForm>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<IndemnityForm>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<IndemnityFormsList> getIndemnityForms(@ApiParam(value = "Unique identifier of the devotee's account" ,required=true) @RequestHeader(value="User-Name", required=true) String userName) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<IndemnityFormsList>(objectMapper.readValue("{  \"indemnityForms\" : [ {    \"indemnityFormTitle\" : \"indemnityFormTitle\",    \"indemnityFormId\" : \"indemnityFormId\",    \"indemnityFormURL\" : \"indemnityFormURL\",    \"indemnityFormDescription\" : \"indemnityFormDescription\",    \"indemnityFormVersion\" : \"indemnityFormVersion\"  }, {    \"indemnityFormTitle\" : \"indemnityFormTitle\",    \"indemnityFormId\" : \"indemnityFormId\",    \"indemnityFormURL\" : \"indemnityFormURL\",    \"indemnityFormDescription\" : \"indemnityFormDescription\",    \"indemnityFormVersion\" : \"indemnityFormVersion\"  } ]}", IndemnityFormsList.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<IndemnityFormsList>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<IndemnityFormsList>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updateIndemnityForm(@ApiParam(value = "Unique identifier of the devotee's account" ,required=true) @RequestHeader(value="User-Name", required=true) String userName,@ApiParam(value = "Id of the indemnity form to be updated",required=true) @PathVariable("indemnityFormId") String indemnityFormId,@ApiParam(value = "" ,required=true )  @Valid @RequestBody IndemnityForm body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
