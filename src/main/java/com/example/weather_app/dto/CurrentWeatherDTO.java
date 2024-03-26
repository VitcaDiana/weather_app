package com.example.weather_app.dto;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CurrentWeatherDTO {
    private double temperature;


    private double feelsLikeTemperature;

    private double humidity;

    private LocalDateTime date;

    public CurrentWeatherDTO() {
    }

    public CurrentWeatherDTO(double temperature, double feelsLikeTemperature, double humidity, LocalDateTime date) {
        this.temperature = temperature;
        this.feelsLikeTemperature = feelsLikeTemperature;
        this.humidity = humidity;
        this.date = date;
    }

    public double getTemperature() {
        return temperature;
    }


    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getFeelsLikeTemperature() {
        return feelsLikeTemperature;
    }

    public void setFeelsLikeTemperature(double feelsLikeTemperature) {
        this.feelsLikeTemperature = feelsLikeTemperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public String getFormattedDateTime() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return date.format(formatter);
    }
}
