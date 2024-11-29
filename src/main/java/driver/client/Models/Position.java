
package driver.client.Models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "left",
    "top"
})
public class Position {

    @JsonProperty("left")
    private Double left;
    @JsonProperty("top")
    private Double top;

    @JsonProperty("left")
    public Double getLeft() {
        return left;
    }

    @JsonProperty("left")
    public void setLeft(Double left) {
        this.left = left;
    }

    @JsonProperty("top")
    public Double getTop() {
        return top;
    }

    @JsonProperty("top")
    public void setTop(Double top) {
        this.top = top;
    }


}
