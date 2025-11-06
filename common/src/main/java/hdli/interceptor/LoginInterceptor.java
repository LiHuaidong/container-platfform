package hdli.interceptor;

/**
 * 登录拦截器
 */
//@Component
//public class LoginInterceptor implements HandlerInterceptor {
public class LoginInterceptor {

//    @Override
//    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//        // 检查是否为方法级别的处理器
//        if (!(handler instanceof HandlerMethod handlerMethod)) {
//            return true;
//        }
//
//        Method method = handlerMethod.getMethod();
//
//        // 检查是否需要登录
//        if (method.isAnnotationPresent(NeedLogin.class)) {
//            String token = request.getHeader("Authorization");
//            if (token == null || token.isEmpty()) {
//                response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
//                response.getWriter().write("{\"code\":401,\"message\":\"未授权，请登录\"}");
//                return false;
//            }
//
//            // TODO: 验证 Token 是否有效（需根据实际业务实现）
//            boolean isValidToken = validateToken(token);
//            if (!isValidToken) {
//                response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
//                response.getWriter().write("{\"code\":401,\"message\":\"Token 无效或已过期\"}");
//                return false;
//            }
//        }
//
//        return true;
//    }
//
//    /**
//     * 验证 Token 是否有效
//     */
//    private boolean validateToken(String token) {
//        // TODO: 实现 Token 验证逻辑
//        return true;
//    }
}