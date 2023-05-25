# Getting Started

### How To Run
Follow below steps:

* [Download Prometheus](https://prometheus.io/download/)
  * Unzip it and run the server
    *  Configure the spring boot service details in "prometheus.yml"'s -
      - scrape_configs:
          - job_name: "MonitoringDemo"
            scrape_interval: 2s
            metrics_path: /actuator/prometheus
          static_configs:
            - targets: ["localhost:8080"] 
    * Run prometheus server
    * Access prometheus server ui at "http://localhost:9090/" or "http://localhost:9090/targets?search="
* [Download Grafana](https://grafana.com/grafana/download)
   * Unzip it and run the server
   * Configure prometheus endpoint in grafana
   * Run grafana server
   * Access grafana at http://localhost:3000/login with default credential "admin/admin"
   * You can also import dashboard - https://grafana.com/grafana/dashboards/4701