# container-platfform

## 服务介绍

容器管理平台(container-platform)是基于Kubernetes的容器化应用管理服务，提供以下核心功能：

- 容器化应用全生命周期管理
- 多集群统一调度
- 智能弹性伸缩
- 可视化监控告警

## 接口列表

### 容器管理

- `POST /api/v1/containers` 创建容器
- `GET /api/v1/containers` 获取容器列表
- `DELETE /api/v1/containers/{id}` 删除容器

### 集群管理

- `POST /api/v1/clusters` 注册集群
- `GET /api/v1/clusters` 查询集群状态
- `PUT /api/v1/clusters/{id}` 更新集群配置

### 监控统计

- `GET /api/v1/metrics` 获取资源使用率
- `GET /api/v1/alerts` 查询告警记录
