
package driver.client.Models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "text",
    "size",
    "position",
    "style"
})
public class Text {

    @JsonProperty("text")
    private String text;
    @JsonProperty("size")
    private Size size;
    @JsonProperty("position")
    private Position position;
    @JsonProperty("style")
    private Style style;

    @JsonProperty("text")
    public String getText() {
        return text;
    }

    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    @JsonProperty("size")
    public Size getSize() {
        return size;
    }

    @JsonProperty("size")
    public void setSize(Size size) {
        this.size = size;
    }

    @JsonProperty("position")
    public Position getPosition() {
        return position;
    }

    @JsonProperty("position")
    public void setPosition(Position position) {
        this.position = position;
    }

    @JsonProperty("style")
    public Style getStyle() {
        return style;
    }

    @JsonProperty("style")
    public void setStyle(Style style) {
        this.style = style;
    }


}
