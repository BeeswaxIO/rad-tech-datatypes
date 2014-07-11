/*
 * Rad-tech-datatypes.
 * Copyright 2014 Metamarkets Group Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.metamx.datatypes.mmx;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.metamx.datatypes.openrtb.Ext;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class MmxBid
{
  private final String id;
  private final String impId;
  private final Integer status;
  private final Double price;
  private final Double clearPrice;
  private final String adId;
  private final List<String> adomain;
  private final String iUrl;
  private final String cId;
  private final String crId;
  private final List<Integer> attr;
  private final String dealId;
  private final Integer height;
  private final Integer width;
  private final Ext ext;

  public MmxBid(
      @JsonProperty("id") String id,
      @JsonProperty("impid") String impId,
      @JsonProperty("status") Integer status,
      @JsonProperty("price") Double price,
      @JsonProperty("clear_price") Double clearPrice,
      @JsonProperty("adid") String adId,
      @JsonProperty("adomain") List<String> adomain,
      @JsonProperty("iurl") String iUrl,
      @JsonProperty("cid") String cId,
      @JsonProperty("crid") String crId,
      @JsonProperty("attr") List<Integer> attr,
      @JsonProperty("dealid") String dealId,
      @JsonProperty("h") Integer height,
      @JsonProperty("w") Integer width,
      @JsonProperty("ext") Ext ext
  )
  {
    this.id = id;
    this.impId = impId;
    this.status = status;
    this.price = price;
    this.clearPrice = clearPrice;
    this.adId = adId;
    this.adomain = adomain;
    this.iUrl = iUrl;
    this.cId = cId;
    this.crId = crId;
    this.attr = attr;
    this.dealId = dealId;
    this.height = height;
    this.width = width;
    this.ext = ext;
  }

  @JsonProperty
  public String getId()
  {
    return id;
  }

  @JsonProperty("impid")
  public String getImpId()
  {
    return impId;
  }

  @JsonProperty
  public Integer getStatus()
  {
    return status;
  }

  @JsonProperty
  public Double getPrice()
  {
    return price;
  }

  @JsonProperty("clear_price")
  public Double getClearPrice()
  {
    return clearPrice;
  }

  @JsonProperty("adid")
  public String getAdId()
  {
    return adId;
  }

  @JsonProperty
  public List<String> getAdomain()
  {
    return adomain;
  }

  @JsonProperty("iurl")
  public String getiUrl()
  {
    return iUrl;
  }

  @JsonProperty("cid")
  public String getcId()
  {
    return cId;
  }

  @JsonProperty("crid")
  public String getCrId()
  {
    return crId;
  }

  @JsonProperty
  public List<Integer> getAttr()
  {
    return attr;
  }

  @JsonProperty("dealid")
  public String getDealId()
  {
    return dealId;
  }

  @JsonProperty("h")
  public Integer getHeight()
  {
    return height;
  }

  @JsonProperty("w")
  public Integer getWidth()
  {
    return width;
  }

  @JsonProperty
  public Ext getExt()
  {
    return ext;
  }

  public static Builder builder()
  {
    return new Builder();
  }

  public static class Builder
  {
    private String id;
    private String impId;
    private Integer status;
    private Double price;
    private Double clearPrice;
    private String adId;
    private List<String> adomain;
    private String iUrl;
    private String cId;
    private String crId;
    private List<Integer> attr;
    private String dealId;
    private Integer height;
    private Integer width;
    private Ext ext;

    public Builder() {}

    public Builder id(final String id)
    {
      this.id = id;
      return this;
    }

    public Builder impId(final String impId)
    {
      this.impId = impId;
      return this;
    }

    public Builder status(final Integer status)
    {
      this.status = status;
      return this;
    }

    public Builder price(final Double price)
    {
      this.price = price;
      return this;
    }

    public Builder clearPrice(final Double clearPrice)
    {
      this.clearPrice = clearPrice;
      return this;
    }

    public Builder adId(final String adId)
    {
      this.adId = adId;
      return this;
    }

    public Builder adomain(final List<String> adomain)
    {
      this.adomain = adomain;
      return this;
    }

    public Builder iUrl(final String iUrl)
    {
      this.iUrl = iUrl;
      return this;
    }

    public Builder cId(final String cId)
    {
      this.cId = cId;
      return this;
    }

    public Builder crId(final String crId)
    {
      this.crId = crId;
      return this;
    }

    public Builder attr(final List<Integer> attr)
    {
      this.attr = attr;
      return this;
    }

    public Builder dealId(final String dealId)
    {
      this.dealId = dealId;
      return this;
    }

    public Builder height(final Integer height)
    {
      this.height = height;
      return this;
    }

    public Builder width(final Integer width)
    {
      this.width = width;
      return this;
    }

    public Builder ext(final Ext ext)
    {
      this.ext = ext;
      return this;
    }


    public MmxBid build()
    {
      return new MmxBid(
          id,
          impId,
          status,
          price,
          clearPrice,
          adId,
          adomain,
          iUrl,
          cId,
          crId,
          attr,
          dealId,
          height,
          width,
          ext
      );
    }
  }
}
