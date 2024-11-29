
package driver.client.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.LinkedHashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "color",
    "fontSize"
})
public class Style {

    @JsonProperty("color")
    private Long color;
    @JsonProperty("fontSize")
    private Double fontSize;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("color")
    public Long getColor() {
        return color;
    }

    @JsonProperty("color")
    public void setColor(Long color) {
        this.color = color;
    }

    @JsonProperty("fontSize")
    public Double getFontSize() {
        return fontSize;
    }

    @JsonProperty("fontSize")
    public void setFontSize(Double fontSize) {
        this.fontSize = fontSize;
    }


}
