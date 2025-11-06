package hdli.cluster.application;

import co.elastic.clients.elasticsearch.ElasticsearchClient;
import co.elastic.clients.json.jackson.JacksonJsonpMapper;
import co.elastic.clients.transport.ElasticsearchTransport;
import co.elastic.clients.transport.rest_client.RestClientTransport;
import org.apache.http.HttpHost;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.springframework.web.client.RestClient;

/**
 * Description:
 *
 * @author: hendrix.li
 * @date: 2025/9/23 21:51
 */
public class Test {

    public static void main(String[] args) {
        // 初始化基本的 REST 客户端
        RestClient restClient = RestClient
                .builder(new HttpHost("localhost", 9200, "https")) // 你的 ES 地址和端口
                .setHttpClientConfigCallback(httpClientBuilder -> {
                    // 配置认证信息（如果 ES 开启了安全特性）
                    BasicCredentialsProvider credsProvider = new BasicCredentialsProvider();
                    credsProvider.setCredentials(
                            AuthScope.ANY,
                            new UsernamePasswordCredentials("elastic", "CdihUVez*LuLnvKSTjXp") // 替换为你的用户名和密码
                    );
                    httpClientBuilder.setDefaultCredentialsProvider(credsProvider);

                    // 其他 HTTP 客户端配置，如超时时间、SSL 上下文等（如需配置 CA 证书，也在此处）
                    // httpClientBuilder.setSSLContext(yourSSLContext);

                    return httpClientBuilder;
                })
                .build();

// 使用 Jackson 映射器创建传输层
        ElasticsearchTransport transport = new RestClientTransport(
                restClient,
                new JacksonJsonpMapper()
        );

// 最后，创建真正的 ElasticsearchClient
        ElasticsearchClient client = new ElasticsearchClient(transport);
    }
}
