<%@ page contentType="text/html" pageEncoding="UTF-8"%> <%@ taglib prefix="c"
uri="http://java.sun.com/jsp/jstl/core"%> <%@ taglib
uri="http://www.springframework.org/tags/form" prefix="form"%>
<html lang="en">
    <head>
        <meta charset="utf-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta
            name="viewport"
            content="width=device-width, initial-scale=1, shrink-to-fit=no"
        />
        <meta name="description" content="Hỏi Dân IT - Dự án laptopshop" />
        <meta name="author" content="Hỏi Dân IT" />
        <title>Dashboard - Hỏi Dân IT</title>
        <link
            href="https://cdn.jsdelivr.net/npm/simple-datatables@7.1.2/dist/style.min.css"
            rel="stylesheet"
        />
        <link href="/css/styles.css" rel="stylesheet" />
        <script
            src="https://use.fontawesome.com/releases/v6.3.0/js/all.js"
            crossorigin="anonymous"
        ></script>
        <link
            href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
            rel="stylesheet"
        />

        <!-- Latest compiled JavaScript -->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>

        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
        <!-- <link href="/css/demo.css" rel="stylesheet"> -->
    </head>
    <body class="sb-nav-fixed">
        <jsp:include page="../layout/header.jsp" />
        <div id="layoutSidenav">
            <jsp:include page="../layout/sidebar.jsp" />

            <div id="layoutSidenav_content">
                <main>
                    <div class="container-fluid px-4">
                        <h1 class="mt-4">Manage Users</h1>
                        <ol class="breadcrumb mb-4">
                            <li class="breadcrumb-item">
                                <a href="/admin">Dashboard</a>
                            </li>
                            <li class="breadcrumb-item active">Users</li>
                        </ol>
                        <div class="mt-5">
                            <div class="row">
                                <div class="col-md-6 col-12 mx-auto">
                                    <h3>Update a user</h3>
                                    <hr />
                                    <form:form
                                        action="/admin/user/update"
                                        method="post"
                                        modelAttribute="newUser"
                                    >
                                        <div class="mb-3" style="display: none">
                                            <label class="form-label"
                                                >ID:</label
                                            >
                                            <form:input
                                                type="text"
                                                class="form-control"
                                                path="id"
                                            />
                                        </div>
                                        <div class="mb-3">
                                            <label class="form-label"
                                                >Email:</label
                                            >
                                            <form:input
                                                type="email"
                                                class="form-control"
                                                path="email"
                                                disabled="true"
                                            />
                                        </div>

                                        <div class="mb-3">
                                            <label class="form-label"
                                                >Phone number:</label
                                            >
                                            <form:input
                                                type="text"
                                                class="form-control"
                                                path="phone"
                                            />
                                        </div>
                                        <div class="mb-3">
                                            <label class="form-label"
                                                >Full Name:</label
                                            >
                                            <form:input
                                                type="text"
                                                class="form-control"
                                                path="fullName"
                                            />
                                        </div>
                                        <div class="mb-3">
                                            <label class="form-label"
                                                >Address:</label
                                            >
                                            <form:input
                                                type="text"
                                                class="form-control"
                                                path="address"
                                            />
                                        </div>

                                        <div class="mb-3">
                                            <label class="form-label"
                                                >Avatar:</label
                                            >
                                            <form:input
                                                type="text"
                                                class="form-control"
                                                path="avatar"
                                            />
                                        </div>

                                        <div class="mb-3">
                                            <label class="form-label"
                                                >Role:</label
                                            >
                                            <form:input
                                                type="text"
                                                class="form-control"
                                                path="role"
                                            />
                                        </div>

                                        <button
                                            type="submit"
                                            class="btn btn-warning"
                                        >
                                            Update
                                        </button>
                                        <a
                                            href="/admin/user"
                                            class="btn btn-success mt-3"
                                            >Back</a
                                        >
                                    </form:form>
                                </div>
                            </div>
                        </div>
                    </div>
                </main>
            </div>
        </div>
        <jsp:include page="../layout/footer.jsp" />

        <script
            src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
            crossorigin="anonymous"
        ></script>
        <script src="js/scripts.js"></script>
    </body>
</html>
