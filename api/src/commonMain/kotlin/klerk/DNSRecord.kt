package klerk

interface DNSRecord {
    val id: String
    val name: String
    val type: String
    val content: String
    val ttl: Int
}