package com.home.budget.model.mono;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SyncMono {

    @JsonProperty("serverKeyId")
    private String serverKeyId;

    @JsonProperty("serverPubKey")
    private String serverPubKey;

    @JsonProperty("serverTimeMsec")
    private Long serverTimeMsec;

    @Override
    public String toString() {
        return "SyncMono{" +
                "serverKeyId='" + serverKeyId + '\'' +
                ", serverPubKey='" + serverPubKey + '\'' +
                ", serverTimeMsec=" + serverTimeMsec +
                '}';
    }

}
