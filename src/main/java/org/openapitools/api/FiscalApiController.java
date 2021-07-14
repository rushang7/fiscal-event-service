package org.openapitools.api;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.ApiParam;
import org.openapitools.model.FiscalEventRequest;
import org.openapitools.model.FiscalEventResponse;
import org.openapitools.model.FiscalInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;

import javax.annotation.PostConstruct;
import javax.validation.Valid;
import java.io.IOException;
import java.util.Optional;
import java.util.UUID;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-07-07T11:26:28.392249+05:30[Asia/Kolkata]")
@Controller
//@RequestMapping("${openapi.eGovIFixFiscalEvent.base-path:/RUSHANGDHANESHA/fiscal-event-service/1.0.0}")
public class FiscalApiController implements FiscalApi {

    private ObjectMapper objectMapper;

    @PostConstruct
    public void init() {
        objectMapper = new ObjectMapper(new JsonFactory());
    }

    @Autowired
    private KafkaTemplate<String, JsonNode> kafkaTemplate;

    private final NativeWebRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public FiscalApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

    @Override
    @PostMapping(
            value = "/fiscal/events/v1/_push",
            produces = { "*/*" },
            consumes = { "application/json" }
    )
    public ResponseEntity<FiscalEventResponse> fiscalEventsV1PushPost(@ApiParam(value = "Details for the new fiscal " +
            "event + " +
            "RequestHeader (meta data of the API)." ,required=true )  @Valid @RequestBody FiscalEventRequest fiscalEventRequest) {
        FiscalInfo fiscalInfo = fiscalEventRequest.getFiscalInfo();
        fiscalInfo.setId(UUID.randomUUID().toString());

        JsonNode jsonNode = objectMapper.convertValue(fiscalInfo, JsonNode.class);

        kafkaTemplate.send("fiscal-event", jsonNode);

        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

}
